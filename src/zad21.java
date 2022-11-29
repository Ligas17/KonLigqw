import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
        int zdeponowana;
        int years;
        int stopa;
        int kapitalizacja;
        Scanner zmienna = new Scanner(System.in);
        System.out.println("Podaj kwote do zdeponowania: ");
        int zdeponowana  = zmienna.nextInt();
        System.out.println("Ile lat pieniadze beda konto: ");
        int years  = zmienna.nextInt();
        System.out.println("Podaj roczna stoper oprocentowania");
        int stopa  = zmienna.nextInt();

