package calculator;

import calculator.config.ComponentManager;
import calculator.controller.CalculateController;

public class Application {
    public static void main(String[] args) {
        ComponentManager componentManager = ComponentManager.getInstance();
        CalculateController calculateController = componentManager.getCalculateController();
        calculateController.run();
    }
}
