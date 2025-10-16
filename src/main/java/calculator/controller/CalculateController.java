package calculator.controller;

import calculator.model.service.CalculateService;
import calculator.view.Input;
import calculator.view.Output;

public class CalculateController {

    private final Input input;
    private final Output output;
    private final CalculateService calculateService;

    public CalculateController(Input input, Output output, CalculateService calculateService) {
        this.input = input;
        this.output = output;
        this.calculateService = calculateService;
    }

    public void run() {
        String raw = input.requestSumString();
        int sum = calculateService.sum(raw);
        output.printResult(sum);
    }
}
