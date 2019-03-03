public class Airplane extends Mashine { // Клас Літак похідний від суперкласу Mashine

    private double mass;
    private int wheelNum;

    public Airplane(String name, double speed, double mass, double maxSpeed, double minSpeed, int wheelNum) {
        super(name, speed, maxSpeed, minSpeed); //Виклик конструктора суперкласу
        this.mass = mass;
        this.wheelNum = wheelNum;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }
    //Перевизначення методів абстрактного класу
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Mass: " + getMass() + " t\nWheel number: " + getWheelNum());
    }

    @Override
    double getMaxSpeed() {
        return super.maxSpeed;
    }

    @Override
    double getMinSpeed() {
        return super.minSpeed;
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    void setName(String name) {
        super.name = name;
    }

    @Override
    void setSpeed(int speed) {
        super.speed = speed;
    }

    @Override
    public double getSpeed() {
        return super.speed;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public int getPassNum() {
        return 0;
    }

    @Override
    public int getWheelNum() {
        return wheelNum;
    }
}