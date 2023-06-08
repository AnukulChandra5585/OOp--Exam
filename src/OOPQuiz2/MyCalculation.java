package OOPQuiz2;

public class MyCalculation extends Calculation{
    public void Multiplication (int x,int y){
        z = x*y;
        System.out.println ("multiplication is :"+z);

    }
    public void Division(int x ,int y){
        z = x/y;
        System.out.println ("Division :"+z);

    }

    public static void main(String[] args) {
        MyCalculation demo1 = new MyCalculation();
        demo1.Addition(12,12);
        demo1.Substraction(12,56);
        demo1.Multiplication(34,56);
        demo1.Division(12,6);

    }
}
