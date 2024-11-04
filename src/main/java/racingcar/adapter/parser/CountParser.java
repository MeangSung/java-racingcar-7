package racingcar.adapter.parser;

import racingcar.exception.CustomException;
import racingcar.exception.ErrorMessage;

public class CountParser implements Parser<Integer> {
    @Override
    public Integer parse(String input) {
        try{
            int count = Integer.parseInt(input);
            isValidSize(count);
            return count;
        }
        catch (Exception e){
            throw new CustomException(ErrorMessage.INVALID_RACING_COUNT_FORMAT_ERROR);
        }
    }

    private void isValidSize(int count) throws IllegalArgumentException {
        if (count < 0) {
            throw new IllegalArgumentException();
        }
    }
}
