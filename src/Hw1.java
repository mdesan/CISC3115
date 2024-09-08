import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Hw1 {

    public static void main(String args[]) throws java.io.FileNotFoundException {

        boolean validInput = false;
        while (!validInput) {
            try {
                Scanner sc = new Scanner(System.in);
                double num1, num2;

                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                double result = num1 + num2;

                if (num1 == Math.floor(num1) && num2 == Math.floor(num2)) {
                    System.out.println("The sum of " + (int) num1 + " and " + (int) num2 + " is " + ((int) result));
                } else if (num1 == Math.floor(num1)) {
                    System.out.println("The sum of " + (int) num1 + " and " + num2 + " is " + (result));
                } else if (num2 == Math.floor(num2)) {
                    System.out.println("The sum of " + num1 + " and " + (int) num2 + " is " + (result));
                } else {
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + ((int) result));
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
    }

    public static boolean allAreEqual(int a, int b, int c){
        return a==b && b==c;
    }
    public static boolean exactlyTwoAreEqual(int a, int b, int c){
                return (a==b && b!=c) || (a!=b && b==c) || (a==c && b!=c);
    }
    public static boolean noneAreEqual(int a, int b, int c){
            return a!=b && b!=c && a!=c;
    }
    public static boolean areAscending(int a, int b, int c){
        return a<=b && b<=c;
  }
    public static boolean areDescending(int a, int b, int c){
        return a>=b && b>=c;
    }
    public static boolean areStrictlyAscending(int a, int b, int c){
        return a<b && b<c;
    }
    public static boolean areStrictlyDescending(int a, int b, int c){
        return a>b && b>c;
    }


    public static int lastIndexOf(int[]arr, int x) {
        int lastIndex =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex=i;
            }
        }
        return lastIndex;

    }

    public static boolean containsOnlyDigits(String s){

        boolean onlyDigits = false;

        for(int i = 0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) {
                return onlyDigits;
            }
        }
        return !onlyDigits;
    }

    public static String longest(String [] arr){
        if(arr.length==0){
            return "";
        }
        String longest = arr[0];
        for(String s: arr){
            if(s.length()>longest.length()){
                 longest = s;
                }
        }
        return longest;
    }

    public static boolean isValidPassword(String pw){
        boolean hasDigit = false;
        boolean hasNumber = false;
        if(pw.length()<5){
            return false;
        }
        else{
            for(int i=0;i<pw.length();i++){
                if(Character.isDigit(pw.charAt(i))){
                    hasDigit=true;
                }
                else if(Character.isLetter(pw.charAt(i))){
                    hasNumber=true;
                }
                if(hasDigit && hasNumber){
                    return true;
                }
            }
        }
        return false;
    }







}


