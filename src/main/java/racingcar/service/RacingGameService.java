package racingcar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingcar.common.Game;
import racingcar.util.RandomUtil;

public class RacingGameService {

    private final RandomUtil randomUtil;

    public RacingGameService(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }

    public List<String> play(Game game) {
        int count = game.getCount();
        List<String> cars = game.getCars();
        int[] moveCount = new int[cars.size()];

        for (int i = 0; i < count; i++) {
            move(moveCount);
            displayRace(cars,moveCount);
        }

        return determineWinners(cars,moveCount);
    }

    private void move(int[] moves) {
        for (int i = 0; i < moves.length; i++) {
            if(randomUtil.goAndStop()){
                moves[i]++;
            }
        }
    }

    private void displayRace(List<String> cars, int[] result) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " : " + "-".repeat(Math.max(0, result[i])));
        }
        System.out.println();
    }

    private List<String> determineWinners(List<String> cars, int[] moveCount) {
        int maxDistance = Arrays.stream(moveCount).max().orElseThrow(NullPointerException::new);
        List<String> winners = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            if(moveCount[i] == maxDistance){
                winners.add(cars.get(i));
            }
        }
        return winners;
    }
}
