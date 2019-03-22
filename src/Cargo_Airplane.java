import java.util.Objects;

public class Cargo_Airplane extends Airplane { //Похідний клас транспортного літака від суперкласу Літака

    private final double maxCargoMass;
    private double cargoMass;

    public Cargo_Airplane(String name, double speed, double mass, double maxSpeed, double minSpeed, int wheelNum, double maxCargoMass, double cargoMass) {
        super(name, speed, mass, maxSpeed, minSpeed, wheelNum); //Виклик конструктора суперкласу
        this.maxCargoMass = maxCargoMass;
        this.cargoMass = cargoMass;
    }

    @Override
    public String toString() {
        return "-------Cargo AirCraft-------\n" + super.toString() +
                "Cargo mass: " + cargoMass +
                " t\nMax cargo mass: " + maxCargoMass +
                "\n--------.toString()---------";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cargo_Airplane that = (Cargo_Airplane) o;
        return Double.compare(that.maxCargoMass, maxCargoMass) == 0 &&
                Double.compare(that.cargoMass, cargoMass) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxCargoMass, cargoMass);
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
