import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bir Sayı Giriniz : ");
        int num = scanner.nextInt();

        for ( int a = 1; a < num; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for (int c = 1; c <= ( 2 * num - (2 * a + 1) ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }
}