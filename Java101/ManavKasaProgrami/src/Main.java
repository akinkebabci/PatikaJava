import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double armutFiyati = 2.14;
        final double elmaFiyati = 3.67;
        final double domatesFiyati = 1.11;
        final double muzFiyati = 0.95;
        final double patlicanFiyati = 5.00;

        double armut, elma, domates, muz, patlican, toplam;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut(Kg) Olarak Giriniz : ");
        armut = scanner.nextDouble();
        System.out.print("Elma(Kg) Olarak Giriniz : ");
        elma = scanner.nextDouble();
        System.out.print("Domates(Kg) Olarak Giriniz : ");
        domates = scanner.nextDouble();
        System.out.print("Muz(Kg) Olarak Giriniz : ");
        muz = scanner.nextDouble();
        System.out.print("Patlican(Kg) Olarak Giriniz : ");
        patlican = scanner.nextDouble();

        toplam = (armut * armutFiyati) + (elma * elmaFiyati) + (domates * domatesFiyati) + (muz * muzFiyati) + (patlican * patlicanFiyati);

        System.out.println("Toplam : " + toplam + " Tl");

    }
}