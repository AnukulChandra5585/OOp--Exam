package ExceptionHandeling;

public class TestThrow {
    static void validate(int age)throws CustException{
        if(age<18)
            throw new CustException("not valid");
        else
            System.out.println ("wellcome to vote kendro");
    }

    public static void main(String[] args) {
        try {
            validate (13);
        }
        catch(CustException e1){
            System.out.println ("Exception hangapanga :"+e1);
        }
finally {
            System.out.println ("ok tata");
        }
    }



    }
