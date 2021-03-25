package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Brawler Yukon", "Mark-1", "Destroyed", 10);
        System.out.println(jaeger1);

        System.out.println();

        Jaeger jaeger2 = new Jaeger("Murder Witch", "Mark-6", "Active", 4);
        System.out.println(jaeger2.toString());
        jaeger2.fly();
        jaeger2.activeArmor();
        jaeger2.killKaiju();
        System.out.println(jaeger2);

        System.out.println();

        Jaeger jaeger3 = new Jaeger("Scrapper", "Mark-2", "Active", 8);
        System.out.println(jaeger3.toString());
        jaeger3.fly();
        jaeger3.activeArmor();
        jaeger3.setStatus("Destroyed");
        System.out.println(jaeger3);
    }
}