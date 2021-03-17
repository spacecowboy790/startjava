public class WolfTest {
    public static void main(String[] args) {
        // создаем новый объект типа Wolf
        Wolf wolf = new Wolf();

        // присваиваем ему значения
        wolf.sex = "Male";
        wolf.name = "Snow";
        wolf.weight = 15.5;
        wolf.age = 3;
        wolf.color = "White";

        // выводим эти значения на экран
        System.out.println(wolf.sex);
        System.out.println(wolf.name);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);

        System.out.println();

        // вызываем методы объекта
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}