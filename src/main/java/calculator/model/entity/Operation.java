package calculator.model.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Operation {

    private String raw;
    protected final List<Character> separators;
    protected final List<String> elements;
    protected final Object result;

    protected Operation(String raw) {
        this.raw = raw;
        separators = new ArrayList<>(List.of(':', ','));
        elements = new ArrayList<>();

        parse();
        validate();
        result = calculate();
    }

    private void parse() throws IllegalArgumentException {
        if (raw.startsWith("//")) {
            if (raw.length() < 5 || !raw.substring(0, 5).endsWith("\\n")) {
                throw new IllegalArgumentException("커스텀 구분자 등록 양식이 잘못됐습니다.");
            }
            separators.add(raw.charAt(2));
            raw = raw.substring(5);
        }

        StringBuilder delimiters = new StringBuilder();
        delimiters.append("[");
        separators.forEach(it -> delimiters.append(it));
        delimiters.append("]+");
        elements.addAll(List.of(raw.split(delimiters.toString())));

        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).isBlank()) {
                elements.set(i, "0");
            }
        }
    }

    private void validate() throws IllegalArgumentException {
        separatorsValidate();
        elementsValidate();
    }

    private void separatorsValidate() throws IllegalArgumentException {
        for (char separator : separators) {
            if (Character.isDigit(separator)) {
                throw new IllegalArgumentException("커스텀 구분자에 숫자를 넣을 수 없습니다.");
            }
        }
    }

    protected abstract void elementsValidate() throws IllegalArgumentException;

    protected abstract Object calculate() throws IllegalArgumentException;

    public abstract Object getResult();
}
