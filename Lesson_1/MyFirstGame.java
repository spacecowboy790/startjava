public class MyFirstGame {
    public static void main(String[] args) {
        int myNumber = 11;
        int computerNumber = 85;

        System.out.println("Ваше число: " + myNumber);

        while (myNumber != computerNumber) {
            if (myNumber > computerNumber) {
                System.out.println("Ваше больше");
                myNumber -= 5;
                System.out.println("Новое число: " + myNumber);
            } else {
                System.out.println("Ваше меньше");
                myNumber += 3;
                System.out.println("Новое число: " + myNumber);
            }
        }

        System.out.println("Угадали! Число компьютера: " + computerNumber);
    }
}