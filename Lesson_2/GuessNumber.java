import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerNumber = random.nextInt(100);
        //System.out.println("Число, которое загадал компьютер: " + computerNumber);
        do {
            System.out.println(player1.getName() + ", введите число:");
            player1.setNumber(scanner.nextInt());
            System.out.println(player2.getName() + ", введите число:");
            player2.setNumber(scanner.nextInt());
            if ((player1.getNumber()  != computerNumber) && (player2.getNumber()  != computerNumber)) {
                System.out.println("Вы оба не угадали, попробуйте еще раз");
            }
        } while ((player1.getNumber() != computerNumber) && (player2.getNumber() != computerNumber));

        if (player1.getNumber() == computerNumber) {
            System.out.println(player1.getName() + " победил");
        } else {
            System.out.println(player2.getName() + " победил");
        }
    }
}