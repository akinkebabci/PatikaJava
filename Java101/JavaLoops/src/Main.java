import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result ;
        for (int i = 1; i <=10 ; i++) {
            System.out.print(N);
            for (int j = 1; j <= 10 ; j++) {
            }
            System.out.println(" X "+(i)+" = "+(N*i));
        }

    }
}