import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answerOfUser = "";
        do {
            Calculator calculator = new Calculator();
            enterMathExpression(calculator);
            System.out.println("Результат: " + calculator.calculate());
        } while (isExist(answerOfUser));
    }

    public static void enterMathExpression(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        calculator.setNum1(scanner.nextInt());
        System.out.println("Введите знак математической операции:");
        calculator.setOperation(scanner.next().charAt(0));
        System.out.println("Введите второе число:");
        calculator.setNum2(scanner.nextInt());
    }

    public static boolean isExist(String answerOfUser) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answerOfUser = scanner.nextLine();
            if (answerOfUser.equals("yes")) {
                return true;
            } else if (answerOfUser.equals("no")) {
                return false;
            }
        } while (true);
    }
}