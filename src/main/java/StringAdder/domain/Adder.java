package StringAdder.domain;

import java.util.List;

public class Adder {

    public static int add(List<Integer> numbers) {

        return sum(numbers);
    }

    private static int sum(List<Integer> inputNumber) {
        return inputNumber.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
