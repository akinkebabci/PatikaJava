import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int birthDate,modAl;
        System.out.print("Lütfen Doğum Tarihinizi Giriniz : ");
        birthDate=scanner.nextInt();

        modAl = birthDate%12;
        if(modAl==0){
            System.out.println("Çin Zodyağınız (Maymun)");
        } else if (modAl==1) {
            System.out.println("Çin Zodyağınız (Horoz)");
        }else if (modAl==2) {
            System.out.println("Çin Zodyağınız (Köpek)");
        }else if (modAl==3) {
            System.out.println("Çin Zodyağınız (Köpek)");
        }else if (modAl==4) {
            System.out.println("Çin Zodyağınız (Fare)");
        }else if (modAl==5) {
            System.out.println("Çin Zodyağınız (Öküz)");
        }else if (modAl==6) {
            System.out.println("Çin Zodyağınız (Kaplan)");
        }else if (modAl==7) {
            System.out.println("Çin Zodyağınız (Tavşan)");
        }else if (modAl==8) {
            System.out.println("Çin Zodyağınız (Ejderha)");
        }else if (modAl==9) {
            System.out.println("Çin Zodyağınız (Yılan)");
        }else if (modAl==10) {
            System.out.println("Çin Zodyağınız (At)");
        }else if (modAl==11) {
            System.out.println("Çin Zodyağınız (Koyun)");
        }else {
            System.out.println("Yanlış seçim yaptınız!!!");
        }
    }
}