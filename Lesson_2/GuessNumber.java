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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        //System.out.println("Число, которое загадал компьютер: " + targetNumber);
        do {
            System.out.println(player1.getName() + ", введите число:");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == targetNumber) {
                System.out.println(player1.getName() + " победил");
                break;
            } else if (player1.getNumber() > targetNumber) {
                System.out.println("Число меньше того, что загадал " + player1.getName());
            }

            System.out.println(player2.getName() + ", введите число:");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == targetNumber) {
                System.out.println(player2.getName() + " победил");
                break;
            } else if (player2.getNumber() < targetNumber) {
                System.out.println("Число больше того, что загадал " + player2.getName());
            }
        } while (true);
    }
}