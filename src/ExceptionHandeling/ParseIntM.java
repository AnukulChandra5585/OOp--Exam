package ExceptionHandeling;

public class ParseIntM {


    public static void main(String[] args) {
        String first ="12";
        try{
            int tem= Integer.parseInt (first);
            System.out.println (tem);
        }
        catch (Exception e){
            System.out.println ("not found");
        }


    }

}
