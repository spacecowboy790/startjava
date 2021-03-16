public class Cycle {

    public static void main(String[] args) {
        int counter = 0;

        // цикл for
        for (; counter <= 20; counter++) {
            System.out.print(counter + " ");
        }

        System.out.println();

        // цикл while
        counter = 6;
        while (counter >= -6) {
            System.out.print(counter + " ");
            counter += -2;
        }

        System.out.println();

        // цикл do-while
        counter = 10;
        int sum = 0;
        do {
            if (counter % 2 != 0) {
                sum += counter;
            }
            counter++;
        } while (counter <= 20);
        System.out.println(sum);
    }
}