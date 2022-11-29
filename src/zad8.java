import java.util.*;
public class zad8 {
    public static void main(String[] args) {
        Scanner zmienna = new Scanner(System.in);
        System.out.println("Podaj dlugosc pokoju1: ");
        int roomlenght1 = zmienna.nextInt();
        System.out.println("Podaj szerokosc pokoju1: ");
        int roomwidth1 = zmienna.nextInt();
        System.out.println("Podaj dlugosc pokoju2: ");
        int roomlenght2 = zmienna.nextInt();
        System.out.println("Podaj szerokosc pokoju2: ");
        int roomwidth2 = zmienna.nextInt();
        System.out.println("Podaj dlugosc pokoju3: ");
        int roomlenght3 = zmienna.nextInt();
        System.out.println("Podaj szerokosc pokoju3: ");
        int roomwidth3 = zmienna.nextInt();
        System.out.println("Podaj dlugosc pokoju4: ");
        int roomlenght4 = zmienna.nextInt();
        System.out.println("Podaj szerokosc pokoju4: ");
        int roomwidth4 = zmienna.nextInt();
        int osoby = 4;
        int room1 = roomlenght1 * roomwidth1;
        int room2 = roomlenght2 * roomwidth2;
        int room3 = roomlenght3 * roomwidth3;
        int room4 = roomlenght4 * roomwidth4;
        int flat = room1 + room2 + room3 + room4;
        double MetrNaOs;
        System.out.println("Cale mieszkanie ma powierzchnie "+ flat);
        MetrNaOs = (double) flat/osoby;
        System.out.println("Powierzchnia na osoby: " + MetrNaOs);

    }
}

