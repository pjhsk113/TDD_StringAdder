package StringAdder.util;

import StringAdder.exception.ConverterExceptionHandler;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    private Converter() {}

    public static List<Integer> toList(String[] input) {
        return Arrays.stream(input)
                .map(Integer::parseInt)
                .peek(ConverterExceptionHandler::validate)
                .collect(Collectors.toList());
    }
}
