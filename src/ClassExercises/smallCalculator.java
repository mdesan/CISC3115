package ClassExercises;

import java.util.InputMismatchException;
import java.util.Scanner;
public class smallCalculator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a,b,result;
        char op;

        try{
            a =  Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        catch(NumberFormatException e){
            System.out.println("Wrong input");
        }

        try {
            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                    break;

                case '-':
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;

                case '*':
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;

                case '/':
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                    break;

            }
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }

    }

}
