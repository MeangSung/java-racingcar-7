package racingcar;

import racingcar.adapter.InputAdapter;
import racingcar.common.Game;
import racingcar.controller.RacingController;
import racingcar.view.Output;

public class RacingGame {

    private final InputAdapter inputAdapter;
    private final RacingController racingController;

    public RacingGame() {
        inputAdapter = new InputAdapter();
        racingController = new RacingController();
    }

    public void start() {
        Output output = new Output();
        Game game = inputAdapter.getGame();
        output.output(racingController.start(game));
    }
}
