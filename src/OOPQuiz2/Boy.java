package OOPQuiz2;

public class Boy extends Human{
    public void eat(){
        System.out.println ("Accha ,thik ase");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
