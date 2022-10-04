public class Car {
    //Nitelikler
    String color;
    String type;
    String model;
    int speed;
    int speedLimit = 180;

    public void increaseSpeed(int incremen){
        if(speed<speedLimit){
            speed+=incremen;
        }

    }
    public void decreaseSpeed(int decrease){
        if(speed>0){
            speed -= decrease;
        }
    }
    public void printSpeed(){
        System.out.println("Hızınız : " + speed);
    }

}
