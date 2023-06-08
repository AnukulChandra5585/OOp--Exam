package Abstraction;
// Example 3 Page : 14
public abstract class Vehicle1 {
    public Vehicle1(){
        System.out.println (" Vehicle is created");
    }
    public abstract void move();
    public void carry(){
        System.out.println (" All vehicle carry a huge laod");
    }
}
