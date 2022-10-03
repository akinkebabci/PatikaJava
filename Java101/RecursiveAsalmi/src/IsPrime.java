public class IsPrime {
    public boolean prime(int num1){
        if(num1==2){
            return true;
        }else if(Math.pow(2,num1)%num1==2) {
            return true;
        }
        return false;
    }
}
