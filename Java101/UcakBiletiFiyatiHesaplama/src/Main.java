import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int age, km, journeyType;
        double normalTutar, gidisDonusIndirim, yasliIndirimi, cocukIndirimi, standartIndirim;

        System.out.print("Lütfen yaşınızı Giriniz : ");
        age = scanner.nextInt();

        System.out.print("Mesafeyi Km Olarak Giriniz : ");
        km = scanner.nextInt();

        System.out.print("Yolcuk Tipini Seçiniz  (1 -> Tek Yön , 2 -> Gidiş Dönüş): ");
        journeyType = scanner.nextInt();

        normalTutar = (km * 10)/100;
        gidisDonusIndirim = (normalTutar * 20) / 100;
        yasliIndirimi = (normalTutar * 30) / 100;
        cocukIndirimi = (normalTutar * 50) / 100;
        standartIndirim = (normalTutar * 10) / 100;

        if (age > 0 && km > 0) {
            switch (journeyType) {
                case 1:
                    System.out.println("Tek Yön Biletiniz Oluşturuldu...");
                    if (age < 12) {
                        System.out.println("Toplam Bilet Tutarınız->" + normalTutar + "İndirimli Bilet Tutarınız : " + (normalTutar - cocukIndirimi));
                        break;
                    } else if (age > 12 && age < 25) {
                        System.out.println("İndirimli Bilet Tutarınız : " + (normalTutar - standartIndirim));
                        break;
                    } else if (age > 65) {
                        System.out.println("İndirimli Bilet Tutarınız : " + (normalTutar - yasliIndirimi));
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Gidiş - Dönüş Bileti Oluşturuldu...");
                    System.out.println("İndirimli Bilet Tutarınız : " + (normalTutar - gidisDonusIndirim));
                    break;

                default:
                    System.out.println("Yanlış Seçim Yaptınız");
            }

        } else {
            System.out.println("Yaş ve km negatif olamaz!!");
        }
    }
}