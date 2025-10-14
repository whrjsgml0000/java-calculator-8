package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public String requestSumString() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String inputValue = Console.readLine();
        Console.close();
        return inputValue;
    }
}
