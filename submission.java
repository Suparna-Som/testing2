package src.main;

import java.util.Scanner;

public class submission {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter value of A and B");
        int A=s1.nextInt();
        int B=s1.nextInt();

        int c=A+B;
        System.out.println("Submission="+c);
       c=A-B;
        System.out.println("Subtraction="+c);
        
    }
}
