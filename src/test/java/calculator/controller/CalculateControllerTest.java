package calculator.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import calculator.config.ComponentManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculateControllerTest {

    ComponentManager componentManager = ComponentManager.getInstance();
    CalculateController calculateController = componentManager.getCalculateController();

    @ParameterizedTest
    @CsvFileSource(resources = "/calculator/controller/test.csv")
    void run(String inputValue, int result) {
        // given
        System.setIn(new ByteArrayInputStream(inputValue.getBytes(StandardCharsets.UTF_8)));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // when
        assertDoesNotThrow(() -> calculateController.run());

        // then
        assertThat(outputStream.toString()).contains("결과 : " + result);
    }
}