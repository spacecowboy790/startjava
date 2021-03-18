public class Jaeger {

    private String name;
    private String mark;
    private String status;
    private int kaijuKilled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
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

    public String getInfo() {
        return "Полная информация: Имя: " + getName() + "; модель: " + getMark() + "; текущий статус: " + getStatus() + "; кайдзю уничтожено: " + getKaijuKilled();
    }
}