package oop._04_srp.calculator.good;

public class BasicCalculator implements Calculator {

    private final static String PLUS = "+";
    private final static String MINUS = "-";
    private final static String MULTIPLY = "*";
    private final static String DIVISION = "/";

    private int left;
    private int right;
    private String operator;
    private int result;

    public BasicCalculator(int left, int right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public void calculate() {
        if (operator.equals(PLUS)) {
            result = left + right;
        } else if (operator.equals(MINUS)) {
            result = left - right;
        } else if (operator.equals(MULTIPLY)) {
            result = left * right;
        } else if (operator.equals(DIVISION)) {
            result = left / right;
        }
    }

    public int getResult() {
        return result;
    }

}
