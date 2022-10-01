import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int sayi ;
        System.out.println("Sayi Giriniz : ");
        sayi =scanner.nextInt();

        for (int i = 1; i < sayi; i*=4) {

            for (int j = 1; j < sayi; j*=5) {
                System.out.print(i +" "+" " +j);
            }
        }
    }
}