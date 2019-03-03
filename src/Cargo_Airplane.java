public class Cargo_Airplane extends Airplane { //Похідний клас транспортного літака від суперкласу Літака

    private final double maxCargoMass;
    private double cargoMass;

    public Cargo_Airplane(String name, double speed, double mass, double maxSpeed, double minSpeed, int wheelNum, double maxCargoMass, double cargoMass) {
        super(name, speed, mass, maxSpeed, minSpeed, wheelNum); //Виклик конструктора суперкласу
        this.maxCargoMass = maxCargoMass;
        this.cargoMass = cargoMass;
    }
    //Перевизначення методу showInfo()
    @Override
    public void showInfo(){
        System.out.println("-------Cargo AirCraft-------");
        super.showInfo(); // Виклик методу showInfo() суперкласу
        System.out.println("Cargo mass: " + getCargoMass() + " t\nMax cargo mass: " + getMaxCargoMass() + " t");
        System.out.println("----------------------------");
    }

    public void setCargoMass(double cargoMass) {
        this.cargoMass = cargoMass;
    }

    public double getCargoMass() {
        return cargoMass;
    }

    public double getMaxCargoMass() {
        return maxCargoMass;
    }
}
