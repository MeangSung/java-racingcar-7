package racingcar.adapter;

import java.util.List;
import racingcar.adapter.parser.CarsParser;
import racingcar.adapter.parser.CountParser;
import racingcar.adapter.parser.Parser;
import racingcar.common.Game;
import racingcar.view.Input;

public class InputAdapter {

    private final Input input;
    private final Parser<List<String>> carsParser;
    private final Parser<Integer> countParser;

    public InputAdapter(){
        input = new Input();
        carsParser = new CarsParser();
        countParser = new CountParser();
    }

    public Game getGame(){
        return new Game(parseCars(input.inputRacingCars()), parseCount(input.inputRacingCars()));
    }

    private List<String> parseCars(String input) {
        return carsParser.parse(input);
    }

    private int parseCount(String input) {
        return countParser.parse(input);
    }
}
