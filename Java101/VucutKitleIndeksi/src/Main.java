import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height;
        int kg;
        double bodyMassIndex;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Giriniz(Metre) : ");
        height = scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = scanner.nextInt();
        bodyMassIndex = kg/(height*height);
        System.out.println("Boyunuz: " + height + "\nKilonuz: " + kg);
        System.out.println("Vücut kitle Endeksiniz : " + bodyMassIndex);

    }
}