import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sayi,sayiKuvveti,sonuc;
        System.out.print("Sayi giriniz : ");
        sayi=scanner.nextInt();
        System.out.print("Sayiyinin Kuvvetini Giriniz : ");
        sayiKuvveti = scanner.nextInt();
        sonuc = 1;
        for (int i = 1; i<=sayiKuvveti; i++) {

            sonuc*=sayi;


        }
        System.out.println(sonuc);


    }
}