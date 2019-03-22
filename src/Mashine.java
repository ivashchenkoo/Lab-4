import java.util.Objects;

public abstract class Mashine implements Run{ // Абстрактний клас Mashine, який реалізує інтерфейс Run
    //Оголошення змінних/констант, однакових дял похідних класів
    protected final double maxSpeed;
    protected final double minSpeed;
    protected String name;
    protected double speed;
    //Конструктор з параметрами
    public Mashine(String name, double speed, double maxSpeed, double minSpeed) {
        this.name = name;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }
    //Визначення методів, однакових для наступних похідних класів
    abstract double getMaxSpeed();
    abstract double getMinSpeed();
    abstract String getName();
    abstract void setName(String name);
    abstract void setSpeed(int speed);
    //Перевизначення методу showInfo() для виведення інформація (змінних/констант класу Mashine)

    @Override
    public String toString() {
        return "Name: " + name +
                "\nSpeed: " + speed +
                " km/h\nMinSpeed: " + minSpeed +
                " km/h\nMaxSpeed: " + maxSpeed +
                " km/h";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mashine mashine = (Mashine) o;
        return Double.compare(mashine.maxSpeed, maxSpeed) == 0 &&
                Double.compare(mashine.minSpeed, minSpeed) == 0 &&
                Double.compare(mashine.speed, speed) == 0 &&
                name.equals(mashine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, minSpeed, name, speed);       // result = 31 * result + (element == null ? 0 : element.hashCode()) ,  element - hash`s args \foreach\
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + getName() + "\nSpeed: " + getSpeed() + " km/h\nMinSpeed: " + getMinSpeed() + " km/h\nMaxSpeed: " + getMaxSpeed() + " km/h");
    }
}
