public class Cycle {

    public static void main(String[] args) {
        int index = 0;

        // цикл for
        for (; index <= 20; index++) {
            System.out.print(index + " ");
        }

        System.out.println();

        // цикл while
        index = 6;
        while (index >= -6) {
            System.out.print(index + " ");
            index += -2;
        }

        System.out.println();

        // цикл do-while
        index = 10;
        int sum = 0;
        do {
            if (index % 2 != 0) {
                sum += index;
            }
            index++;
        } while (index <= 20);
        System.out.println(sum);
    }
}