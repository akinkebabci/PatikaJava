import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecursivePower recursivePower = new RecursivePower();
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.println("Taban Giriniz : ");

        num1 = scanner.nextInt();

        System.out.println("Kuvvet Giriniz : ");

        num2 = scanner.nextInt();
        System.out.println(recursivePower.power(num1,num2));

    }
}