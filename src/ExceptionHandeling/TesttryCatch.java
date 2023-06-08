package ExceptionHandeling;
//problem without Exception Handeling ;

public class TesttryCatch {
    public static void main(String[] args) {
        try {
            int a = 50 / 0;
        }
        catch(Exception e){
            System.out.println (e);
        }
        System.out.println("rset of the code....");
    }
}
