public class MyFirstGame {
    public static void main(String[] args) {
        int num1 = 11; // мое число
        int num2 = 85; // число, которое загадал компьютер
        boolean end = false;

        System.out.println("Ваше число: " + num1);

        while (!end) {
            if (num1 > num2) {
                System.out.println("Ваше больше");
                num1 -= 5;
                System.out.println("Новое число: " + num1);
            } else if (num1 < num2) {
                System.out.println("Ваше меньше");
                num1 += 3;
                System.out.println("Новое число: " + num1);
            } else {
                System.out.println("Угадали! Число компьютера: " + num2);
                end = true;
            }
        }
    }
}