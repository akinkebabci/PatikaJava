import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int toplam = 0;


        do {
            System.out.print("Sayi Giriniz : ");
            num = scanner.nextInt();
            if (num % 4 == 0){
                toplam += num;
            }

        } while (num % 2 == 0);

        System.out.println("Toplam : "+toplam);
    }

}