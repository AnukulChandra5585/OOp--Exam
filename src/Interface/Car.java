package Interface;

import java.util.concurrent.Callable;

public class Car extends Vehicle{
    public void move(){
        System.out.println (" car moves");
    }
    public void Carry(){
        System.out.println ("Car carry loads");
    }

    public static void main(String[] args) {
        Car c= new Car ();
        c.Carry ();
    }
}
