package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        do {
            Calculator calculator = new Calculator();
            enterMathExpression(calculator);
            System.out.println("Результат: " + calculator.calculate());
        } while (isExist());
    }

    public static void enterMathExpression(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическое выражение:");
        calculator.setMathExpression(scanner.nextLine().split(" "));
    }

    public static boolean isExist() {
        Scanner scanner = new Scanner(System.in);
        String answerOfUser = "";
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answerOfUser = scanner.nextLine();
        } while (!answerOfUser.equals("yes") && !answerOfUser.equals("no"));
        return answerOfUser.equals("yes");
    }
}