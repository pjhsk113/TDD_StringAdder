package StringAdder.util;

import java.util.List;

public class Spliter {
    private static final int CUSTOM_DELIMITER_START_INDEX = 2;
    private static final int CUSTOM_DELIMITER_END_INDEX = 3;
    private static final int CUSTOM_NUMBER_START_INDEX = 5;
    private static final String DELIMITER_PATTERN = "[,:]";

    private Spliter() { }

    public static List<Integer> split(String input) {
        if (input.contains("//")) {
            String customDelimiter = subStringDelimiter(input);
            String customFormula = subStringFormula(input);
            return Converter.toList(customFormula.split(customDelimiter));
        }

        return Converter.toList(input.split(DELIMITER_PATTERN));
    }

    private static String subStringDelimiter(String input) {
        return input.substring(CUSTOM_DELIMITER_START_INDEX, CUSTOM_DELIMITER_END_INDEX);
    }

    private static String subStringFormula(String input) {
        return input.substring(CUSTOM_NUMBER_START_INDEX);
    }

}
