package StringAdder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AdderTest {

    static Stream<Arguments> sumTest() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3), 6),
                Arguments.of(Arrays.asList(1, 1, 2, 3, 4, 5), 16),
                Arguments.of(Arrays.asList(1, 1, 2, 3, 4, 5, 6), 22),
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 28)
        );
    }

    @DisplayName("값이 잘 더해지는지 테스트")
    @ParameterizedTest
    @MethodSource("sumTest")
    void sum_test(List<Integer> input, int expected) {
        int result = Adder.sum(input);
        assertThat(result).isSameAs(expected);
    }

}