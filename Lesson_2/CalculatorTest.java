import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        // переменная для ответа пользователя
        String answerOfUser;

        do {
            // запускаем калькулятор
            runCalculator();

            // спрашиваем пользователя о продолжении
            answerOfUser = getAnswer();

            // выводим сообщение с предложением до тех пор, пока не появится yes или no
            while (!answerOfUser.equals("yes") && !answerOfUser.equals("no")) {
                answerOfUser = getAnswer();
            }
        } while (!answerOfUser.equals("no"));
    }

    // функция для запуска калькулятора
    public static void runCalculator() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculator.setNum1(scanner.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setOperation(scanner.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setNum2(scanner.nextInt());
        System.out.println("Результат: " + calculator.makeCalculation());
    }

    // функция для ответа пользователя
    public static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить вычисления? [yes/no]: ");
        return scanner.nextLine();
    }
}