public class zad6  {
    public static void main(String[] args) {
        int osoby = 4;
        int roomlenght1 = 3;
        int roomwidth1 = 4;
        int roomlenght2 = 2;
        int roomwidth2 = 3;
        int roomlenght3 = 2;
        int roomwidth3 = 2;
        int roomlenght4 = 3;
        int roomwidth4 = 4;
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


