package OOPQuiz2;

public class Bike2 extends Vehicle2 {
    int speed = 199;
    public Bike2(int speed){
        super(100);

}
    public void display(){
        System.out.println ("Vehicle speed :"+super.speed);
        System.out.println ("Bike 2 speed :"+speed);
    }

    public static void main(String[] args) {
        Bike2 bike = new Bike2 (12);

        bike.display ();
    }
}
