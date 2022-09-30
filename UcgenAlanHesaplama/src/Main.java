import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        int ucgenCevre;
        double ucgenAlan;
        int u ;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Birinci Alanı Giriniz : ");
        a = scanner.nextInt();
        System.out.print("İkinci Alanı Giriniz : ");
        b= scanner.nextInt();
        System.out.print("Üçüncü Alanı Giriniz : ");
        c= scanner.nextInt();
        u = (a+b+c)/2;
        ucgenCevre = 2*u;
        ucgenAlan = Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        System.out.println("Üçgenin Alani : " + ucgenAlan);
        System.out.println("Üçgenin Çevresi : " + ucgenCevre);

    }
}