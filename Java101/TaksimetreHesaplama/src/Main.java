import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        final int acilis = 10;
        double tutar = 0;
        System.out.println("Hoşgeldiniz Taksimetre Durumunuz : " +acilis);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Km Gittiniz : ");
        km = scanner.nextInt();


        tutar = (km*2.20)+acilis;

        tutar = tutar<20.0 ? 20:tutar;

        System.out.println(tutar);

    }
}