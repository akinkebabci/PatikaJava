public class Main {

    public static void main(String[] args) {
        double sonuc = 0;
        for (int i = 1; i <100 ; i++) {
            if(Math.pow(2,i) % i==2){
                System.out.print(i+" ");
            }
        }

    }
}