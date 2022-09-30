import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float notFizik, notKimya, notTurkce, notTarih, notMuzik, ortalama;
        Scanner scanner = new Scanner(System.in,StandardCharsets.US_ASCII);
        System.out.print("Lütfen Fizik Notunuzu Giriniz : ");
        notFizik = scanner.nextFloat();
        System.out.print("Lütfen Kimya Notunuzu Giriniz : ");
        notKimya = scanner.nextFloat();
        System.out.print("Lütfen Türkçe Notunuzu Giriniz : ");
        notTurkce = scanner.nextFloat();
        ;
        System.out.print("Lütfen Tarih Notunuzu Giriniz : ");
        notTarih = scanner.nextFloat();
        ;
        System.out.print("Lütfen Muzik Notunuzu Giriniz : ");
        notMuzik = scanner.nextFloat();

        ortalama = (notFizik + notKimya + notTurkce + notTarih + notMuzik) / 5;
        System.out.println("Ortalamanız : " + ortalama);

        String durum = ortalama<60 ? "Kaldınız":"Geçtiniz";
        System.out.println(durum);

    }
}