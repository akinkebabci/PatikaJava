import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();

        if (n%2!=0) {
            System.out.print("Weird");
        }else{
            if (n>1 && n<6) {
                System.out.print("Not Weird");
            }else if (n>5 && n<21) {
                System.out.print("Weird");
            }else {
                System.out.print("Not Weird");
            }
        }
    }
}