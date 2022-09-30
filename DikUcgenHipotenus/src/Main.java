import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dik1;
        int dik2;
        double hipotenus;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Karşı Kenar Uzunluğunu Giriniz : ");
        dik1 = scanner.nextInt();
        System.out.print("Komşu Kenar Uzunluğunu Giriniz : ");
        dik2 = scanner.nextInt();
        hipotenus =Math.sqrt(((dik1*dik1) +(dik2*dik2))) ;
        System.out.println(hipotenus);
    }
}