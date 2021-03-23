import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumber guessNumber = createGame();
        do {
            guessNumber.start();
        } while (isNext());
    }

    private static GuessNumber createGame() {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        return new GuessNumber(player1, player2);
    }

    private static Player createPlayer(int numberOfGamer) {
        System.out.println("Введите имя " + numberOfGamer  + "-го игрока:");
        return new Player(scanner.nextLine());
    }

    private static boolean isNext() {
        String answerOfPlayers = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            answerOfPlayers = scanner.nextLine();
        } while (!answerOfPlayers.equals("yes") && !answerOfPlayers.equals("no"));
        return answerOfPlayers.equals("yes");
    }
}