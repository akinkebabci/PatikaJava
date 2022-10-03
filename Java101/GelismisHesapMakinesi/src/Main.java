import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Matematik matematik =new Matematik();
        int select,num1,num2;

        do {
            System.out.println("Lütfen Seçim Yapınız\n" + "*********************************************");
            System.out.println("""
                    1- Toplama İşlemi
                    2- Çıkarma İşlemi
                    3- Çarpma İşlemi
                    4- Bölme işlemi
                    5- Üslü Sayı Hesaplama
                    6- Faktoriyel Hesaplama
                    7- Mod Alma
                    8- Dikdörtgen Alan ve Çevre Hesabı
                    0- Çıkış Yap""");
            System.out.print("Seçiniz : ");
            select = scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println("Toplama İşlem Seçildi");
                    matematik.topla();
                    break;
                case 2:
                    System.out.println("Çıkarma İşlemi Seçildi");
                    matematik.cikarma();
                    break;
                case 3:
                    System.out.println("Çarpma İşlemi Seçildi");
                    matematik.cikarma();
                    break;
                case 4:
                    System.out.println("Bölme İşlemi Seçildi");
                    matematik.bolme();
                    break;
                case 5:
                    System.out.println("Üs Alma İşlemi Seçildi");
                    matematik.usAl();
                    break;
                case 6:
                    System.out.println("Faktoriyel Hesaplama Seçildi");
                    matematik.faktoriyel();
                    break;
                case 7:
                    System.out.println("Mod Alma İşlemi Seçildi");
                    matematik.modAl();
                    break;
                case  8:
                    System.out.println("Diktörtgen Alan Ve Çevre Hesaplama Seçildi");
                    matematik.dikdortgenAlanCevre();
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");
                    break;
            }

        }while (select != 0);

    }
}