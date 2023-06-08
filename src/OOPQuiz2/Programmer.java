package OOPQuiz2;

public class Programmer extends Employee {
    float bonus = 1000;

    public static void main(String[] args) {
        Programmer p= new Programmer();
        System.out.println ("Programmer salary : "+p.salary);
        System.out.println ("bonus of a programmer :"+p.bonus);


    }
}
