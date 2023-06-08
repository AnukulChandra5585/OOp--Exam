package Practice;

public class Hard {
    int age = 45;
    static void validate(int age) throws BangladeshException{
        try {

            if (age < 18) {
                throw new BangladeshException (" you rae not valid");

            } else {
                System.out.println (" welcome to the vote ");
            }
        }
        catch (Exception c){
            System.out.println (c);
        }
    }

    public static void main(String[] args) {


        System.out.println ("sorry bro");
    }


    }


