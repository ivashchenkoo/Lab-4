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
