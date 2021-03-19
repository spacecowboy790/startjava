public class Jaeger {

    private String name;
    private String mark;
    private String status;
    private int kaijuKilled;

    public Jaeger(String name, String mark, String status, int kaijuKilled) {
        this.name = name;
        this.mark = mark;
        this.status = status;
        this.kaijuKilled = kaijuKilled;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void activeArmor() {
        System.out.println("Оружие активировано");
    }

    public void fly() {
        System.out.println("Начался взлет");
    }

    public void killKaiju() {
        System.out.println("Кайдзю уничтожен");
        kaijuKilled++;
    }

    @Override
    public String toString() {
        return "Полная информация: Имя: " + name + "; модель: " + mark + "; текущий статус: " + status + "; кайдзю уничтожено: " + kaijuKilled;
    }
}