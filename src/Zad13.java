import java.util.*;
public class Zad13 {
    public static void main(String[] args) {


        int cookies = 40;
        int porcja = 10;
        int kcalporcje = 3000;
        double ciasteczkokcal = (double) kcalporcje/cookies;
        Scanner zmienna = new Scanner(System.in);
        System.out.println("Podaj  ilosc zjedzonych ciastek: ");
        int dziennieciastka = zmienna.nextInt();
        double kcaldziennie = dziennieciastka * ciasteczkokcal;
        System.out.println("Ilosc kalorii zjedzonych " + kcaldziennie);
    }
}
