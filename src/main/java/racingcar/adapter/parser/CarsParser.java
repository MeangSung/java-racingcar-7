package racingcar.adapter.parser;

import java.util.List;
import racingcar.exception.CustomException;
import racingcar.exception.ErrorMessage;

public class CarsParser implements Parser<List<String>>{

    private final static int MAX_NAME_LENGTH = 5;

    @Override
    public List<String> parse(String input) {
        try{
            String[] cars = input.split(",");
            validate(cars);
            return List.of(cars);
        }
        catch (Exception e) {
            throw new CustomException(ErrorMessage.INVALID_NAME_FORMAT_ERROR);
        }
    }

    private void validate(String[] strings) throws IllegalArgumentException {
        for (String string : strings) {
            if (string.length() > MAX_NAME_LENGTH) {
                throw new CustomException(ErrorMessage.INVALID_NAME_COUNT_FORMAT_ERROR);
            }
        }
    }
}
