package StringAdder.domain;

import java.util.List;

public class Adder {

    private static int sum(List<Integer> inputNumber) {
        return inputNumber
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
