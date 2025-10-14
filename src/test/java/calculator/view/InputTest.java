package calculator.view;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class InputTest {

    Input input = new Input();

    @Test
    void 입력값_반환_성공() {
        // given
        String inputValue = "hello";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(inputValue.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // when
        String requestedSumString = input.requestSumString();

        // then
        assertThat(outputStream.toString()).contains("덧셈할 문자열을 입력해 주세요.");
        assertThat(requestedSumString).isEqualTo(inputValue);
    }
}