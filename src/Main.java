public class Main {
    public static void main(String[] args) {

        Airplane a1 = new Airliner("Airliner UA", 1200.50, 40.2, 1700, 800, 520, 0, 502, 4);
        a1.showInfo();
        a1.setMass(42.3);
        ((Airliner) a1).setPassNum(519);
        showInfo(a1);

        Cargo_Airplane a2 = new Cargo_Airplane("Cargo Aircraft DE", 1000, 160.2, 1300, 600, 5, 200, 140);
        showInfo(a2);

    }

    public static void showInfo(Airplane airplane){
        airplane.showInfo();
    }
}
