import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Airplane airplanes[] = { new Airliner("Airliner UA", 1200.50, 40.2, 1700, 800, 520, 0, 502, 4),
                new Cargo_Airplane("Cargo Aircraft UA", 800, 162, 1400, 700, 5, 200, 140),
                new Cargo_Airplane("Cargo Aircraft UA", 800, 162, 1400, 700, 5, 200, 140),
                new Cargo_Airplane("Cargo Aircraft UAE", 800, 162, 1400, 700, 5, 200, 140),
                new Cargo_Airplane("Cargo Aircraft DE", 1000, 160.2, 1300, 600, 5, 200, 140),
                new Cargo_Airplane("Cargo Aircraft EU", 1000, 160.2, 1500, 600, 5, 200, 140)
        };

        // Перевантажений метод .toString()
        for (Airplane el : airplanes)
            System.out.println(el + "\n");

        // Перевантажений метод .equals()
        System.out.println("airplanes[1].equals(airplanes[2]) - " + airplanes[1].equals(airplanes[2]));
        System.out.println("airplanes[1].equals(airplanes[3]) - " + airplanes[1].equals(airplanes[3]));
        System.out.println();

        // Перевантажений метод .hashCode()
        for (int i = 0; i < airplanes.length; ++i)
            System.out.println("airplanes[" + i + "] - " + airplanes[i].hashCode());


        Map<String, Airplane> map = new HashMap<>();

        for (Airplane el : airplanes)
            map.put(Integer.toString(el.hashCode()),el);

        Airplane a1 = map.get(Integer.toString(airplanes[4].hashCode()));
        System.out.println("\n" + a1);
    }

    public static void showInfo(Airplane airplane){
        airplane.showInfo();
    }
}
