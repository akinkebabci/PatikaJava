import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = scanner.nextInt();
        System.out.println("1->Toplama" + "\n2->Çıkarma" + "\n3->Çarpma" + "\n4->Bölme");
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama İşlemi Seçildi\n" + "Sonucunuz : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi Seçildi\n" + "Sonucunuz : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Seçildi\n" + "Sonucunuz : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölme İşlemi Seçildi\n" + "Sonucunuz : " + (num1 / num2));
                break;
            default:
                System.out.println("Geçersiz Bir işlem seçildi Lütfen Belirtilen Aralıkta Değer Giriniz!!!");
        }
    }
}