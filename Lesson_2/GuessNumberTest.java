import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber guessNumber = createGame();
        do {
            guessNumber.start();
        } while (isNext());
    }

    public static GuessNumber createGame() {
        System.out.println("Введите имя первого игрока:");
        Player player1 = createPlayer();
        System.out.println("Введите имя второго игрока:");
        Player player2 = createPlayer();
        return new GuessNumber(player1, player2);
    }

    public static Player createPlayer() {
        Scanner scanner = new Scanner(System.in);
        return new Player(scanner.nextLine());
    }

    public static boolean isNext() {
        Scanner scanner = new Scanner(System.in);
        String answerOfPlayers = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]");
            answerOfPlayers = scanner.nextLine();
        } while (!answerOfPlayers.equals("yes") && !answerOfPlayers.equals("no"));
        return answerOfPlayers.equals("yes");
    }
}