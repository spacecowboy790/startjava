import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        //System.out.println("Число, которое загадал компьютер: " + targetNumber);
        do {
            enterNumber(player1);
            if (compareNumbers(player1, targetNumber)) {
                break;
            }
            enterNumber(player2);
            if (compareNumbers(player2, targetNumber)) {
                break;
            }
        } while (true);
    }

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player, int targetNumber) {
        if (player.getNumber() == targetNumber) {
            System.out.println(player.getName() + " победил");
            return true;
        }
        return player.getNumber() > targetNumber ?
                printMessage("меньше", player.getName()) :
                printMessage("больше", player.getName());
    }

    private boolean printMessage(String condition, String playerName) {
        System.out.println("Число " + condition + " того, что назвал " + playerName);
        return false;
    }
}