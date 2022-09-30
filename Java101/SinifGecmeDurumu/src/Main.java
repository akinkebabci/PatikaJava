import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        int toplam = 0;
        int girilenDers = 0;
        double avarage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = scanner.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = scanner.nextInt();
        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = scanner.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya=scanner.nextInt();
        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = scanner.nextInt();


        if (matematik>=0 && matematik<=100){
            toplam+=matematik;
            girilenDers++;

        }else if(fizik>=0 && fizik<=100){
            toplam+=fizik;
            girilenDers++;
        } else if (turkce>=0 && turkce<=100) {
            toplam+=turkce;
            girilenDers++;
        }else if (kimya>=0 && kimya<=100) {
            toplam += turkce;
            girilenDers++;
        }else if (muzik>=0 && muzik<=100) {
            toplam += muzik;
            girilenDers++;
        }if (girilenDers==0){
            System.out.println("Girilen Ders Bulunamadı");
        }else {
            avarage = (toplam/girilenDers)/5;
            if(avarage<=55){
                System.out.println("Kaldınız");
                System.out.println("Ortalama" + avarage);
            }else {
                System.out.println("Geçtiniz");
                System.out.println("Ortalama" + avarage);
            }
        }





    }
}