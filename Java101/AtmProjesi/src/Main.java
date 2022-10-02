import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String userName,password;
        int right = 3 ;
        int balance = 1500;
        int select ;
        while (right>0){
            System.out.print("Kullanıcı Adınız :");
            userName = scanner.nextLine();
            System.out.print("Parolanız :");
            password = scanner.nextLine();

            if (userName.equals("user123") && password.equals("12345")) {
                System.out.println("XXX Banlasına Hoşgeldiniz");

                System.out.print("1=> Para Yatırma\n"+"2=>Para Çekme\n"+"3=>Bakiye Sorgulama\n"+"4=>Çıkış Yap");
                System.out.print("Yapmak İstediğiniz İşlemi Seçiniz :");
                select = scanner.nextInt();

                switch (select){
                    case 1:
                        System.out.print("Yatırmak İstediğiniz Tutar :");
                        int price = scanner.nextInt();
                        balance+=price;
                        System.out.println("Para Yatırıldıktan Sonraki Hesap Bakiyesi : " +balance);
                        break;
                    case  2 :
                        System.out.println("Hesaptaki Para Miktarı :" + balance);
                        System.out.println("Çekmek istediğiniz para miktarı :");
                        price =scanner.nextInt();
                        if (balance>price){
                            balance-=price;
                            System.out.println("Hesapta Kalan para" + balance);
                        }else {
                            System.out.println("Çekmek İstediniz Tutar Hesap Bakisinden Fazla");
                        }break;
                    case 3:
                        System.out.println("Bakiyeniz :" +balance);
                        break;
                    case 4:
                        System.out.println("Hesaptan Çıkılıyor....Hoşçakalın");;
                        return;
                    default:
                        System.out.println("Yanlış Seçim Yaptınız : ");
                    }
                }else {
                right--;
                System.out.println("Bilgileriniz Yanlış.Tekrar Deneyiniz\n"+"Kalan Giriş Hakkı :" +right);
                if(right==0){
                    System.out.println("Sistemden Çıkılıyor Lütfen Banka İle İletisime Geçiniz!!!");
                }
            }
        }

    }
}