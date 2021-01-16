package StringAdder.exception;

public class StringAdderExceptionHandler {
    private static final String CAN_NOT_INPUT_NEGATIVE= "음수는 입력할 수 없습니다!";

    private StringAdderExceptionHandler() {}

    public static void validate(int input) {
        isPositive(input);
    }

    private static void isPositive(int input) {
        if (input < 0) {
            throw new RuntimeException(CAN_NOT_INPUT_NEGATIVE);
        }
    }
}
