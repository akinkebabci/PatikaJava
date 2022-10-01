import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n,r,nfaktoriyel,rFaktoriyel,kombinasyon,sonuc;
        System.out.print("n. Kombinasyon Sayısı Giriniz : ");
        n = scanner.nextInt();
        System.out.print("r. Kombinasyon Sayısı Giriniz : ");
        r = scanner.nextInt();
        nfaktoriyel = 1;
        rFaktoriyel = 1 ;
        kombinasyon = 1;
        if(n>r){
            for (int i = 1; i <= n; i++) {
                nfaktoriyel*=i;
            }
            for (int i = 1; i <= r; i++) {
                rFaktoriyel*=i;
            }
            for (int i = 1; i <=n-r ; i++) {
                kombinasyon*=i;
            }
            sonuc = nfaktoriyel/(rFaktoriyel*kombinasyon);
            System.out.println("n'nin r'li Kombinasyonu : " + sonuc);
        }else {
            System.out.println("n sayısı r sayısından Küçük Olamaz...");
        }



    }

}