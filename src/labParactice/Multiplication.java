package labParactice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int a,b,max;
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter 1st number :");
        a = sc.nextInt();
        b= sc.nextInt ();
        max = a+b;
        System.out.printf ("M is "+max);
    }
}
