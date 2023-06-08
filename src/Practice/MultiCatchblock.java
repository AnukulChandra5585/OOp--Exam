package Practice;

public class MultiCatchblock {
    public static void main(String[] args) {
        int a[] = {12,657,87,98};
        try{

            System.out.println (a[12]);
            System.out.println ("assa ok");
        }
        catch(ArithmeticException e){
            System.out.println (e);

        }
        catch(Exception e1){
            System.out.println ("Exception :" +e1);
        }
        finally {
            System.out.println (" all Done bro");
        }
        }
    }

