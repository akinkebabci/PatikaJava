import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOrani = 0.18;
        double tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Tutari Giriniz : ");
        tutar = scanner.nextDouble();
        double durum = tutar>0 && tutar<=1000 ?  (kdvOrani = kdvOrani) : (kdvOrani -= 0.10);
        double kdvTutar = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutar;
        double kdvHaricTutar = kdvliTutar / (1 + kdvOrani);

        System.out.println("Kdv Tutarı : " + kdvTutar+"TL" + "\nKdv Haric Tutarınız : " + kdvHaricTutar+"TL" + "\nKdv Dahil Tutarınız : " + kdvliTutar+"TL");


    }
}