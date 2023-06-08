package OOPQuiz2;

public class Vehivle3 {
    int speed = 50;
    String Colour;
    public Vehivle3(String Colour){
        this.Colour = Colour;
        System.out.println ("vehicle Created with colour "+Colour );


    }
    public void display(){
        System.out.println ("Vehicle speed is :"+speed);
    }
}
