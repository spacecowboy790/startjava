import java.util.Scanner;

public class Calculator {

    private int num1;
    private int num2;
    private char operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void calculate() {
        enterMathExpression();
        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '^':
                int res = 1;
                for (int i = 1; i <= num2; i++) {
                    res *= num1;
                }
                System.out.println(res);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Неверная операция");
                break;
        }
        askAboutContinue();
    }

    public void enterMathExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        setNum1(scanner.nextInt());
        System.out.println("Введите знак математической операции: ");
        setOperation(scanner.next().charAt(0));
        System.out.println("Введите второе число: ");
        setNum2(scanner.nextInt());
    }

    public void askAboutContinue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            String answerOfUser = scanner.nextLine();
            if (answerOfUser.equals("yes")) {
                calculate();
                break;
            }
            if (answerOfUser.equals("no")) {
                break;
            }
        }
    }
}