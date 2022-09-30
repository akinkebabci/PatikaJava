import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "userAdmin" , password ="admin123";
        String userNameInput ,passwordInput;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
        userNameInput = scanner.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz : ");
        passwordInput = scanner.nextLine();

        if (userName.equals(userNameInput) && password.equals(passwordInput)){
            System.out.println("Sisteme Başarılı Bir Şekilde Giriş Yapıldı !");

        }else{
            System.out.println("Kullanıcı/Şifre Yanlış");
            System.out.print("Şifrenizi Sıfırlamak İstermisiniz e/h : ");
            String secim = scanner.nextLine();
            switch (secim){
                case "e" , "E":
                    System.out.print("Şifrenizi Giriniz : ");
                    passwordInput = scanner.nextLine();
                    if (password.equals(passwordInput)){
                        System.out.println("Şifre Oluşturulamadı!!! Girdiğiniz Şifre Eski Şifreniz ile Aynı olamaz ");
                    }else {
                        password = passwordInput;
                        System.out.println("Şifre  Oluşturuldu...");
                    }
                    break;
                case "h","H":
                    System.out.println("Şifrenizi değiştirmek için Daha Sonra Şifremi Unuttum Butonu İle Değiştirebilirsiniz!!!");
                    break;

            }
        }


    }
}