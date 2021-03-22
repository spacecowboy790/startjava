import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = enterPlayersNames();
        do {
            guessNumber.playGame();
        } while (isExist());
    }

    public static GuessNumber enterPlayersNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        return new GuessNumber(player1, player2);
    }

    public static boolean isExist() {
        Scanner scanner = new Scanner(System.in);
        String answerOfUsers = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            answerOfUsers = scanner.nextLine();
        } while (!answerOfUsers.equals("yes") && !answerOfUsers.equals("no"));
        return answerOfUsers.equals("yes");
    }
}