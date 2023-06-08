package OOPQuiz2;

public class CseTeacher extends Teacher{
    String mainSubject = "CSE" ;

    public static void main(String[] args) {


        CseTeacher a = new CseTeacher ();
        a.job();
        a.setInformation ("Teacher","Daffodill");
        System.out.println (a.designation);
        System.out.println (a.uniName);
        System.out.println (a.mainSubject);
        a.job();

    }

}
