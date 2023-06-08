package Interface;

public class DemoClass implements FirstInterface,SecondInterface{
    public void myMethod(){
        System.out.println ("Some Msg");
    }
    public void myOtherMethod(){
        System.out.println ("The Other msg");
    }

    public static void main(String[] args) {
        DemoClass d= new DemoClass ();
        d.myMethod ();
        d.myOtherMethod ();
    }
}
