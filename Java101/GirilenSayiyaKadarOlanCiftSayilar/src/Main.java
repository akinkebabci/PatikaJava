import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Sayi Giriniz : ");

        int sayi = scanner.nextInt();
        int sayac = 0;
        int sonuc = 0;
        for (int i = 0; i < sayi ; i++) {
            if(i%3==0 && i%4 == 0){
                sayac++;
                sonuc+=i;
            }
        }
        System.out.println("Ortalama" + (sonuc/sayac));
    }
}