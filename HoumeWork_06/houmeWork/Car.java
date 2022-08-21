package houmeWork;

public class Car implements Comparable {
    private int id;
    private String model;
    private double fuel;
    private int cost;
    private static int curId = 1;

    public Car(String model, double fuel, int cost) {
        this.model = model;
        this.fuel = fuel;
        this.cost = cost;
        this.id = curId++;
    }

    public int getСost() {
        return cost;
    }

    @Override
    public int compareTo(Object o) {
        if (fuel < ((Car) o).fuel) {
            return 1;
        } else if (fuel > ((Car) o).fuel) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "№" + id + " {" +
                "Модель='" + model +
                ", Расход топлива=" + fuel +
                " л/100км, Цена='" + cost + " UAH}";
    }
}
