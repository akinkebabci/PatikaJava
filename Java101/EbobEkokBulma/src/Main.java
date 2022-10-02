import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2,sayac;
        System.out.print("Birinci Sayıyı giriniz :");
        num1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = scanner.nextInt();
        sayac = 1;
        int ebob = 1;
        if(num1<num2){
            while (sayac<=num1) {
                sayac += 1;
                if (num1 % sayac == 0 && num2 % sayac == 0) {
                    ebob = sayac;
                }
            }
            System.out.println("Ebob : "+ ebob);
        }else {
            System.out.println("Birinci Sayi,İkinci sayıdan Büyük olamaz");
        }

        System.out.println("Ekok : "+((num1*num2)/ebob));





    }
}