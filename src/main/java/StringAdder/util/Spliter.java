package StringAdder.util;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spliter {
    private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.)\\n(.*)");
    private static final String DELIMITER_PATTERN = "[,:]";

    private Spliter() { }

    public static List<Integer> split(String input) {
        if (input.contains("//")) {
            Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(input);
            String customDelimiter = matcher.group(1);
            return Converter.toList(matcher.group(2).split(customDelimiter));
        }

        return Converter.toList(input.split(DELIMITER_PATTERN));
    }
}
