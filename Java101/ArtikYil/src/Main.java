import java.security.PrivateKey;
import java.security.SignedObject;
import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int year;
        System.out.print("Lütfen Yıl Giriniz : ");
        year = scanner.nextInt();



        if (year%4 == 0 && year%100 !=0 || year%400 == 0){
            System.out.println("Girdiğiniz yıl Bir Artık Yıldır");
        }else{
            System.out.println("Girdiğiniz Yıl Bir Artık Yıl Değildir");
        }
    }
}