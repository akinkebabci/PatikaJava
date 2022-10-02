import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int toplam;
        System.out.println("LÜtfen Sayı Giriniz :");
        int sayi = scanner.nextInt();
        toplam = 0;
        double mukemmelSayi = (Math.pow(2,sayi-1)) * (Math.pow(2,sayi)-1);

        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if(sayi==toplam){
            System.out.println("Sayi Mükemmel Sayıdır.");
        }else {
            System.out.println("Sayi Mükemmel sayi değildir");
        }
    }
}