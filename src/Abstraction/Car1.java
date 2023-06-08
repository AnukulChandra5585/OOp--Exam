package Abstraction;
// Example 3 Page : 14
public class Car1 extends Vehicle1{
    public Car1(){
        System.out.println (" Car is Created");
    }
    public void move(){
        System.out.println (" Car moves Slowly");
    }

    public static void main(String[] args) {
        Car1 c = new Car1();

        c.move ();
        c.carry ();

    }

}
