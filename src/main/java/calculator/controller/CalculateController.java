package calculator.controller;

import calculator.view.Input;
import calculator.view.Output;

public class CalculateController {

    private final Input input;
    private final Output output;

    public CalculateController(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void run() {
        throw new IllegalArgumentException();
    }
}
