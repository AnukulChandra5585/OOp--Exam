package Practice;

public class Throw {

        static  void valdate(int age){
            if(age<18){
                throw new ArithmeticException(" not valid");}
            else{
                System.out.println ("welcome to votekendro");
            }

        }


    public static void main(String[] args) {
        valdate (12);
        System.out.println ("rest of the code");
    }
    }

