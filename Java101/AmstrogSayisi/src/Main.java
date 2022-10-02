import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Sayı giriniz :");
        int number = scanner.nextInt();
        int basNumber = 0;
        int basValue  ;
        int tempNumber =number;
        int resault = 0;
        while (tempNumber!=0) {
            tempNumber/=10;
            basNumber++;

        }
        tempNumber = number;
        while (tempNumber !=0){
            basValue = tempNumber%10;
            resault+=basValue;
            tempNumber/=10;

        }
        System.out.println(resault);
    }
}