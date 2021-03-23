import java.util.Scanner;

public class GuessNumberTest {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static int numberOfGamer = 1;

    public static void main(String[] args) {
        GuessNumber guessNumber = createGame();
        do {
            guessNumber.start();
        } while (isNext());
    }

    private static GuessNumber createGame() {
        Player player1 = createPlayer();
        Player player2 = createPlayer();
        return new GuessNumber(player1, player2);
    }

    private static Player createPlayer() {
        System.out.println("Введите имя " + (numberOfGamer++) + "-го игрока:");
        return new Player(SCANNER.nextLine());
    }

    private static boolean isNext() {
        String answerOfPlayers = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            answerOfPlayers = SCANNER.nextLine();
        } while (!answerOfPlayers.equals("yes") && !answerOfPlayers.equals("no"));
        return answerOfPlayers.equals("yes");
    }
}