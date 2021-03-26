package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] mathExpression;

    public void setMathExpression(String[] mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate() {
        int num1 = Integer.parseInt(mathExpression[0]);
        String operation = mathExpression[1];
        int num2 = Integer.parseInt(mathExpression[2]);

        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return Math.floorDiv(num1, num2);
            case "^":
                return (int) Math.pow(num1, num2);
            case "%":
                return Math.floorMod(num1, num2);
            default:
                System.out.println("Неверная операция");
        }
        return 0;
    }
}