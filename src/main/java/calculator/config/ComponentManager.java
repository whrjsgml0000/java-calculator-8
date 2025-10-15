package calculator.config;

import calculator.controller.CalculateController;
import calculator.model.service.CalculateService;
import calculator.model.service.impl.CalculateServiceImpl;
import calculator.view.Input;
import calculator.view.Output;

public class ComponentManager {
    private static ComponentManager componentManager;
    private final Input input;
    private final Output output;
    private final CalculateService calculateService;
    private final CalculateController calculateController;
    private ComponentManager() {
        input = new Input();
        output = new Output();
        calculateService = new CalculateServiceImpl();
        calculateController = new CalculateController(input, output, calculateService);
    }
    public static ComponentManager getInstance() {
        if(componentManager == null){
            componentManager = new ComponentManager();
        }
        return componentManager;
    }

    public Input getInput() {
        return input;
    }

    public Output getOutput() {
        return output;
    }

    public CalculateService getCalculateService() {
        return calculateService;
    }

    public CalculateController getCalculateController() {
        return calculateController;
    }
}
