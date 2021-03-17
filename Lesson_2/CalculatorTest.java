import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        // переменная для ответа пользователя
        String answerOfUser;

        do {
            // выполняем вычисление
            computation();
            
            // спрашиваем пользователя о продолжении
            answerOfUser = answer();

            // выводим сообщение с предложением до тех пор, пока не появится yes или no
            while (!answerOfUser.equals("yes") && !answerOfUser.equals("no")) {
                answerOfUser = answer();
            }
        } while (!answerOfUser.equals("no"));
    }

    // функция для вычислений
    public static void computation() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculator.setNum1(scanner.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setOperation(scanner.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setNum2(scanner.nextInt());
        System.out.println("Результат: " + calculator.computation());
    }

    // функция для ответа пользователя
    public static String answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить вычисления? [yes/no]: ");
        return scanner.nextLine();
    }
}