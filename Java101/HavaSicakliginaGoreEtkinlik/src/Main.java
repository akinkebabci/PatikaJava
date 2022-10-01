import java.util.Scanner;
/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
public class Main {
    public static void main(String[] args) {
        int heat ;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen Sıcaklık Değerini Giriniz : ");
        heat = scanner.nextInt();


        if (heat>25){
            System.out.println("Yüzmeye git..");
        } else if (heat<25 && heat>15) {
            System.out.println("Pikniğe Git");
        }else if (heat>5 && heat<=15){
            System.out.println("Sinemaya Git");
        }else if (heat<=5){
            System.out.println("Hamama Git");
        }

    }
}