import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        Scanner scanner = new Scanner(System.in);
        int num1;
        boolean trim;

        System.out.print("Lütfen Sayı Giriniz : ");
        num1 =scanner.nextInt();
        trim = isPrime.prime(num1);

        if (trim == true){
            System.out.println("Asal Sayidir..");
        }else {
            System.out.println("Asal Değildir..");
        }

    }
}