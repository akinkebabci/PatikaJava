import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int query,nums,buyuk,kucuk;
        System.out.println("Kaç Adet Sayi Girmek İstiyorsunuz : ");
        query = scanner.nextInt();
        System.out.println("Sayi Giriniz : ");

        nums =scanner.nextInt();
        buyuk=nums;
        kucuk = nums;
        for (int i = 0; i < query-1; i++) {
            System.out.println("Sayi Giriniz : ");
            nums = scanner.nextInt();
            if (nums>buyuk){
                buyuk=nums;
            }else {
                kucuk=nums;
            }
        }
        System.out.println("En Büyük Sayi :" +buyuk);
        System.out.println("En Kucuk Sayi :" +kucuk);

    }
}