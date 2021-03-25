package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        char operation = '+';

        if (operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else if (operation == '^') {
            int res = 1;
            for (int i = 1; i <= num2; i++) {
                res *= num1;
            }
            System.out.println(res);
        } else if (operation == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Неверная операция");
        }
    }
}