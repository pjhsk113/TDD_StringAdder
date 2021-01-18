package StringAdder.domain;

import java.util.List;

public class Adder {

    public static int add(List<Integer> numbers) {
        if (isBlank(numbers)) {
            return 0;
        }
        return sum(numbers);
    }

    private static int sum(List<Integer> inputNumber) {
        return inputNumber.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean isBlank(List<Integer> input) {
        return input.isEmpty();
    }
}
