package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {
    public static void main(String[] args) {
        // создаем новый объект типа Wolf
        Wolf wolf = new Wolf();

        // присваиваем ему значения
        wolf.setSex("Male");
        wolf.setName("Snow");
        wolf.setWeight(15.5);
        wolf.setAge(3);
        wolf.setColor("White");

        // выводим эти значения на экран
        System.out.println(wolf.getSex());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());

        System.out.println();

        // вызываем методы объекта
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}