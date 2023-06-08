package OOPQuiz2;

public class Person {
   protected String name;
   protected int age ;

      public void setValue(String N,int A){
         this.name = N;
         this.age = A;
         System.out.println ("Name : "+name);
         System.out.println ("age :"+age );
      }
}
