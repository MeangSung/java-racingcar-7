package racingcar.exception;

public enum ErrorMessage {

    INVALID_NAME_FORMAT_ERROR("잘못된 이름의 형식입니다."),
    INVALID_NAME_COUNT_FORMAT_ERROR("자동차의 이름이 5글자 이상입니다."),
    INVALID_RACING_COUNT_FORMAT_ERROR("잘못된 횟수의 형식입니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
