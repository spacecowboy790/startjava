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
            if (checkForFinish(player1, targetNumber)) {
                break;
            }

            enterNumber(player2);
            if (checkForFinish(player2, targetNumber)) {
                break;
            }
        } while (true);
    }

    private void enterNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        player.setNumber(scanner.nextInt());
    }

    private boolean checkForFinish(Player player, int targetNumber) {
        if (player.getNumber() > targetNumber) {
            System.out.println("Число меньше того, что назвал " + player.getName());
            return false;
        } else if (player.getNumber() < targetNumber) {
            System.out.println("Число больше того, что назвал " + player.getName());
            return false;
        } else {
            System.out.println(player.getName() + " победил");
            return true;
        }
    }
}