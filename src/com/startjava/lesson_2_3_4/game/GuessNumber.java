package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;

        // индекс для наихудщего исхода: если не будет введено загаданное компьютером число
        int indexForWin = 10;
        //System.out.println("Число, которое загадал компьютер: " + targetNumber);

        System.out.println("У вас 10 попыток");
        for (int i = 0; i < 10; i++) {
            player1.getEnteredNumbers()[i] = enterNumber(player1, i);
            if (compareNumbers(player1, i)) {
                indexForWin = i + 1;
                break;
            }
            player2.getEnteredNumbers()[i] = enterNumber(player2, i);
            if (compareNumbers(player2, i)) {
                indexForWin = i + 1;
                break;
            }
        }

        printEnteredNumbers(player1, indexForWin);
        printEnteredNumbers(player2, indexForWin);
        printResults(player1, player2, indexForWin);
    }

    private int enterNumber(Player player, int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", введите число:");
        int enteredNumber = scanner.nextInt();
        player.setEnteredNumber(index, enteredNumber);
        return enteredNumber;
    }

    private boolean compareNumbers(Player player, int index) {
        if (player.getEnteredNumbers()[index] == targetNumber) {
            System.out.println(player.getName() + " победил");
            return true;
        }
        String result = player.getEnteredNumbers()[index] > targetNumber ? "меньше" : "больше";
        System.out.println("Число " + result + " того, что назвал " + player.getName());
        return false;
    }

    private void printEnteredNumbers(Player player, int indexForWin) {
        int[] numbers = Arrays.copyOf(player.getEnteredNumbers(), indexForWin);
        System.out.print("Игрок " + player.getName() + " ввел числа: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void printResults(Player player1, Player player2, int indexForWin) {
        if (player1.getEnteredNumbers()[indexForWin - 1] == targetNumber) {
            printWinMessage(player1.getName(), indexForWin);
        } else if (player2.getEnteredNumbers()[indexForWin - 1] == targetNumber) {
            printWinMessage(player2.getName(), indexForWin);
        } else {
            printFailMessage();
        }
        Arrays.fill(player1.getEnteredNumbers(), 0, indexForWin, 0);
    }

    private void printWinMessage(String name, int indexForWin) {
        System.out.println("Игрок " + name + " угадал число " + targetNumber + " с " +
                indexForWin + " попытки");
    }

    private void printFailMessage() {
        System.out.println("У " + player1.getName() + " закончились попытки");
        System.out.println("У " + player2.getName() + " закончились попытки");
    }
}