package StringAdder.exception;

public class ConverterExceptionHandler {
    private static final String CAN_NOT_INPUT_NEGATIVE= "음수는 입력할 수 없습니다!";

    private ConverterExceptionHandler() {}

    public static void validate(int input) {
        isPositive(input);
    }

    private static void isPositive(int input) {
        if (input < 0) {
            throw new RuntimeException(CAN_NOT_INPUT_NEGATIVE);
        }
    }
}
