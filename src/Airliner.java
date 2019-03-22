import java.util.Objects;

public class Airliner extends Airplane { //Похідний клас пасажирського літака від суперкласу Літака

    private final int maxPassNum;
    private final int minPassNum;
    private int passNum;

    public Airliner(String name, double speed, double mass, double maxSpeed, double minSpeed, int maxPassNum, int minPassNum, int passNum, int wheelNum) {
        super(name, speed, mass, maxSpeed, minSpeed, wheelNum); //Виклик конструктора суперкласу
        this.maxPassNum = maxPassNum;
        this.minPassNum = minPassNum;
        this.passNum = passNum;
    }

    @Override
    public String toString() {
        return "----------Airliner----------\n" + super.toString() +
                "Number of passengers: " + passNum +
                "\nMax number of passengers: " + maxPassNum +
                "\nMin number of passengers: " + minPassNum +
                "\n--------.toString()---------";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Airliner airliner = (Airliner) o;
        return maxPassNum == airliner.maxPassNum &&
                minPassNum == airliner.minPassNum &&
                passNum == airliner.passNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxPassNum, minPassNum, passNum);
    }

    //Перевизначення методів суперкласу
    @Override
    public void showInfo(){
        System.out.println("----------Airliner----------");
        super.showInfo(); // Виклик методу showInfo() суперкласу
        System.out.println("Number of passengers: " + getPassNum() + "\nMax number of passengers: " + getMaxPassNum() + "\nMin number of passengers: " + getMinPassNum());
        System.out.println("----------------------------");
    }

    @Override
    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public int getMaxPassNum() {
        return maxPassNum;
    }

    public int getMinPassNum() {
        return minPassNum;
    }
}
