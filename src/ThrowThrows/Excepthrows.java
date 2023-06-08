package ThrowThrows;

public class Excepthrows {
    static void validate(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException ("soory man you are not valid");
        else{
            System.out.println ("wlcome to the vote man");
        }
    }
    public static void main(String[] args) {
        try {
            validate (11);
        }
        catch (InvalidAgeException e1){
            System.out.println (e1);
        }

    }


}
