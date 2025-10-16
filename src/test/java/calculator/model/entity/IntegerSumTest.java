package calculator.model.entity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class IntegerSumTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/calculator/controller/success_test.csv")
    void calculate_성공(String raw, int result) {
        // given
        // when
        IntegerSum integerSum = new IntegerSum(raw);

        // then
        assertThat(integerSum.getResult()).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/calculator/controller/failure_test.csv")
    void calculate_실패(String raw) {
        // given
        // when & then
        assertThatThrownBy(()->new IntegerSum(raw))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}