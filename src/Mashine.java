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
    public void showInfo() {
        System.out.println("Name: " + getName() + "\nSpeed: " + getSpeed() + " km/h\nMinSpeed: " + getMinSpeed() + " km/h\nMaxSpeed: " + getMaxSpeed() + " km/h");
    }
}
