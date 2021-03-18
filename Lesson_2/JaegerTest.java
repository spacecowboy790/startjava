public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Brawler Yukon");
        jaeger1.setMark("Mark-1");
        jaeger1.setStatus("Destroyed");
        jaeger1.setKaijuKilled(10);
        System.out.println(jaeger1.getInfo());

        System.out.println();

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setName("Murder Witch");
        jaeger2.setMark("Mark-6");
        jaeger2.setStatus("Active");
        jaeger2.setKaijuKilled(4);
        System.out.println(jaeger2.getInfo());
        jaeger2.fly();
        jaeger2.activeArmor();
        jaeger2.killKaiju();
        System.out.println(jaeger2.getInfo());

        System.out.println();

        Jaeger jaeger3 = new Jaeger();
        jaeger3.setName("Scrapper");
        jaeger3.setMark("Mark-2");
        jaeger3.setStatus("Active");
        jaeger3.setKaijuKilled(8);
        System.out.println(jaeger3.getInfo());
        jaeger3.fly();
        jaeger3.activeArmor();
        jaeger3.setStatus("Destroyed");
        System.out.println(jaeger3.getInfo());
    }
}