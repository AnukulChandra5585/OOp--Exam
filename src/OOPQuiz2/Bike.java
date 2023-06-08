package OOPQuiz2;

public class Bike extends Vehicle{
    void run(){
        System.out.println ("please ride the bike carefully");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run ();
    }

}
