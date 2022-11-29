public class zad2 {
    public static void main(String[] args) {
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
        System.out.println("Pokoj nr 1 ma powierzchnie " + room1);
        System.out.println("Pokoj nr 1 ma powierzchnie " + room2);
        System.out.println("Pokoj nr 1 ma powierzchnie " + room3);
        System.out.println("Pokoj nr 1 ma powierzchnie " + room4);
        System.out.println("Cale mieszkanie ma powierzchnie "+ flat);
    }
}
