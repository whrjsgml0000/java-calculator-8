package calculator.view;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class OutputTest {

    Output output = new Output();

    @Test
    void printResult() {
        // given
        int result = 1;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // when
        output.printResult(result);

        // then
        assertThat(outputStream.toString()).isEqualTo("결과 : " + result);
    }
}