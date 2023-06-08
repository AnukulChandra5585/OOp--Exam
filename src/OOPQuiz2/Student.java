package OOPQuiz2;

public class Student extends Person{
    private int id;
    private double cgpa;
    public void setInfornation( int I,double C){
        this.id = I;
        this.cgpa = C;
    }
    public void display(){
        System.out.println ("ID is :"+id);
        System.out.println ("Cgpa: "+cgpa);

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setValue("anukul Chandra ",22);
        s.setInfornation(221-15-5585,3.59);
        s.display ();
    }





}
