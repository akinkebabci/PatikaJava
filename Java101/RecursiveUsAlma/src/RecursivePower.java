import java.util.Scanner;

public class RecursivePower {
    public int power(int num1 , int num2){
        int result;
        if(num2 == 0){
            return 1;
        }else{
            result = power(num1,num2-1)*num1 ;
            return result;
        }

    }
}
