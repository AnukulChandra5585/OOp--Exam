package ExceptionHandeling;

public class TestFinallyBlock {
    public static void main(String[] args) {
        try{
                int data = 25/0;
            System.out.println ("ha ha ha ha");
    }
        catch(NullPointerException e1){
            System.out.println ("Exception :"+e1);

        }
    finally{
            System.out.println ("Finally Block always executed");
        }
        System.out.println ("baki code gula holo");

    }
}
