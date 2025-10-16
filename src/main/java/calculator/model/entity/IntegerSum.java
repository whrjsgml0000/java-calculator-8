package calculator.model.entity;

public final class IntegerSum extends Operation {

    public IntegerSum(String raw) {
        super(raw);
    }

    @Override
    protected void elementsValidate() throws IllegalArgumentException {
        for (String element : elements) {
            elementValidate(element);
        }
    }

    private void elementValidate(String element) {
        if(element.isBlank()) return;
        try {
            if (Integer.parseInt(element) < 0)
                throw new IllegalArgumentException("음수를 연산에 포함할 수 없습니다.");
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("등록된 구분자만 사용할 수 있습니다." + separators);
        }
    }

    @Override
    protected Integer calculate() throws IllegalArgumentException {
        int result = 0;

        for (String element : elements) {
            result += Integer.parseInt(element);
        }

        return result;
    }

    @Override
    public Integer getResult() {
        return (Integer) result;
    }
}
