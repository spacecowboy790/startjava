package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, enteredNumbers.length);
    }

    public void setEnteredNumber(int index, int enteredNumber) {
        enteredNumbers[index] = enteredNumber;
    }
}
