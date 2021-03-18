import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        // переменная для ответа пользователя
        String answerOfUser;

        do {
            // запускаем калькулятор
            System.out.println("Результат: " + enterMathExpression());

            // спрашиваем пользователя о продолжении
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answerOfUser = askAboutContinue();
        } while (!answerOfUser.equals("no"));
    }

    // функция для запуска калькулятора
    public static int enterMathExpression() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculator.setNum1(scanner.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setOperation(scanner.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setNum2(scanner.nextInt());
        return calculator.makeCalculation();
    }

    // функция для вопроса пользователю
    public static String askAboutContinue() {
        Scanner scanner = new Scanner(System.in);
        String answerOfUser = scanner.nextLine();
        while (!answerOfUser.equals("yes") && !answerOfUser.equals("no")) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answerOfUser = scanner.nextLine();
        }
        return answerOfUser;
    }
}
