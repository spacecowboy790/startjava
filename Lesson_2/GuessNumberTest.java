import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.playGame();
        } while (isExist());
    }

    public static boolean isExist() {
        Scanner scanner = new Scanner(System.in);
        String answerOfUser = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            answerOfUser = scanner.nextLine();
        } while (!answerOfUser.equals("yes") && !answerOfUser.equals("no"));
        return answerOfUser.equals("yes");
    }
}