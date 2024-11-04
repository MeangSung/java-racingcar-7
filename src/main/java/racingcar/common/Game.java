package racingcar.common;

import java.util.List;

public class Game {
    private final int count;
    private final List<String> cars;

    public Game(List<String> cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public List<String> getCars() {
        return cars;
    }

    public int getCount() {
        return count;
    }
}
