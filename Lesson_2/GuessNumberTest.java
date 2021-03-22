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
        String answerOfPlayers = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            answerOfPlayers = scanner.nextLine();
        } while (!answerOfPlayers.equals("yes") && !answerOfPlayers.equals("no"));
        return answerOfPlayers.equals("yes");
    }
}