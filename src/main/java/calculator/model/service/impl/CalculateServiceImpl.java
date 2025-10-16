package calculator.model.service.impl;

import calculator.model.entity.IntegerSum;
import calculator.model.service.CalculateService;

public class CalculateServiceImpl implements CalculateService {

    @Override
    public int sum(String raw) {
        IntegerSum sum = new IntegerSum(raw);
        return sum.getResult();
    }
}
