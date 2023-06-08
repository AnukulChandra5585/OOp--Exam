package Practice;

public class Test {
    public static void main(String[] args) {
        try{
            int data = 25/0;
            System.out.println (" dhora porse re");
        }
        catch (Exception e){
            System.out.println ("Exception : "+e);

        }
        finally{
            System.out.println (" ar ki ki ase dede vai");
        }
    }

}
