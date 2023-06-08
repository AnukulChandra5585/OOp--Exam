package OOPQuiz2;
;
public class Car extends Vehivle3{
    int speed = 100;
    public Car(){
        super("Red");
        System.out.println ("Car is created with");

    }
    public void display(){
        System.out.println ("Vehicle speed = "+super.speed);
        System.out.println ("Car speed ="+speed);

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.display ();
    }
}
