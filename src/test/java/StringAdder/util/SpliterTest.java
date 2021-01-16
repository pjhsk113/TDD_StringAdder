package StringAdder.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SpliterTest {

    @DisplayName("구분자 split 테스트")
    @ParameterizedTest
    @ValueSource(strings = {
            "1,2,3",
            "2,5:6:4,2",
            "//.\\n5.6",
            "//-\\n5-6",
            "//.\\n5.3",
            "//&\\n5&6",
            "//;\\n1;1;1"})
    void split_test (String input) {
        int output = Spliter.split(input).size();
        List<Integer> result = Spliter.split(input);
        assertThat(result.size()).isEqualTo(output);
    }

    @DisplayName("입력이 음수일 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {
            "-1,2,3",
            "2,-5:6:4,2"})
    void exception_test(String input) {
        assertThatThrownBy(() -> {
            Spliter.split(input);
        }).isInstanceOf(RuntimeException.class);
    }
}