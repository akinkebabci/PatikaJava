import java.util.Scanner;

public class Matematik {

    public void topla(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("1.Sayi : ");
        num1 = scanner.nextInt();
        System.out.print("2.Sayi : ");
        num2 =scanner.nextInt();
        System.out.println("Sonuç : " +(num1+num2));
    }
    public void cikarma(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("1.Sayi : ");
        num1 = scanner.nextInt();
        System.out.print("2.Sayi : ");
        num2 =scanner.nextInt();
        System.out.println("Sonuç : " + (num1-num2));
    }

    public void carpma(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("1.Sayi : ");
        num1 = scanner.nextInt();
        System.out.print("2.Sayi : ");
        num2 =scanner.nextInt();
        System.out.println(("Sonuç : " +num1 * num2));
    }

    public void bolme(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("1.Sayi : ");
        num1 = scanner.nextInt();
        System.out.print("2.Sayi : ");
        num2 =scanner.nextInt();
        System.out.println("Sonuç : " +(num1 / num2));
    }

    public  void modAl(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("1.Sayi : ");
        num1 = scanner.nextInt();
        System.out.print("2.Sayi : ");
        num2 =scanner.nextInt();
        System.out.println("Sonuç : " +(num1 % num2));
    }

    public void usAl(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("Taban Sayısını Giriniz ");
        num1 = scanner.nextInt();
        System.out.print("Kuvvetini Giriniz");
        num2 =scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *=num1;
        }
        System.out.println("Sonuç : " + result);
    }

    public void dikdortgenAlanCevre() {
        Scanner scanner = new Scanner(System.in);
        double num1,num2;
        System.out.print("Kısa Kenar : ");
        num1 = scanner.nextDouble();
        System.out.print("Uzun Kenar : ");
        num2 =scanner.nextInt();

         double alan = (2 * (num1 + num2));
         double cevre = (num1 * num2);
        System.out.print("Alan : " + alan);
        System.out.print("Çevre : " + cevre);

    }
    public void faktoriyel(){
        Scanner scanner = new  Scanner(System.in);
        int num1,result;
        System.out.println("Sayi Giriniz : ");
        num1 = scanner.nextInt();
        result = 1;
        for (int i = 1; i <= num1; i++) {
            result*=i;
        }
        System.out.println("Sonuc : "+ result);

    }

}
