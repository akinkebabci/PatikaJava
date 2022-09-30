import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double pi = 3.14;
        double r;
        double daireninCevresi;
        double daireAlani;
        double merkezAci;
        double daireDilimiAlani;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Yari Çap Giriniz : ");
        r = scanner.nextDouble();
        System.out.print("Lütfen Merkez Açı Ölçüsünü Giriniz : ");
        merkezAci = scanner.nextDouble();
        daireninCevresi = 2 * pi * r;
        daireAlani = pi * (r*r);
        daireDilimiAlani = (pi*(r*r)*merkezAci)/360;


        System.out.println("Dairenin Alani : "+ daireAlani);
        System.out.println("Dairenin Çevresi : "+daireninCevresi);
        //Daire Dilim Alani..
        System.out.println("Daire Diliminin Alanı : " + daireDilimiAlani);
    }
}