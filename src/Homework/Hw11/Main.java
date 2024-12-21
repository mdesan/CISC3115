package Homework.Hw11;

import java.util.Scanner;

public class Main {

    public static long fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static int sum(int n){
        if(n==1){
            return n;
        }
        else{
            return sum(n-1)+sum(n-2);
        }
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x * power(x,n-1);
        }
    }

    public static int quotient(int m, int k){
        if(k>m){
            return 0;
        }
        else{
            return 1 + quotient(m-k,k);
        }
    }

    public static int product(int m, int k){
        if(k==0){
            return 0;
        }
        else{
            return m + product(m,k-1);
        }
    }

    public static double len(String s){
        if(s.equals("")){
            return 0;
        }
        else{
            return 1+ len(s.substring(0,s.length()-1));
        }
    }

    public static void printTriangle(int n){

    }

    public static String replace(String s) {

        if (!s.isEmpty()) {
            if (s.charAt(0) == ' ') {
                return "*" + replace(s.substring(1));
            } else {
                return s.charAt(0) + replace(s.substring(1));
            }
        }
        else{
            return s;
        }
    }

    public static boolean containsVowel(String s){
        if(s.isEmpty()){
            return false;
        }
        if("aeiouAEIOU".indexOf(s.charAt(0))!=-1){
            return true;
        }
        else{
            return containsVowel(s.substring(1));
        }
    }

    public static String reverse(String s){
        if(s.isEmpty() || s.length()==1){
            return s;
        }
        else{
            return reverse(s.charAt(s.length()-1) + s.substring(0,s.length()-2));
        }

    }

    public static String makeStars(int n){
        if(n==0){
            return "";
        }
        else{
            return "*" + makeStars(n-1);
        }
    }

    public static String makeLine(char c, int n){
        if(n==0){
            return "";
        }
        else{
            return c + makeLine(c, n-1);
        }
    }

    public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }

    public static void copy(Scanner sc){
        if(sc.hasNext()){
        System.out.println(sc.next()); copy(sc);
        }
    }

    public static int add(Scanner sc){
        if(sc.hasNext()){
           return sc.nextInt() + add(sc);
        }
        return 0;
    }

    public static int count(Scanner sc){
        if(sc.hasNext()){
            sc.next();
            return 1 + count(sc);
        }
        return 0;
    }

    public static int countPos(Scanner sc){
        if(sc.hasNext()){
            if(sc.nextInt()>0){
                return 1 + count(sc);
            }
            else{
                return count(sc);
            }
        }
        return 0;
    }

    public static void copy2(Scanner sc){
        if(sc.hasNext()){
            copy2(sc);
            System.out.println(sc.next());
        }
    }

    public static int oddevenfact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * oddevenfact(n-2);
        }
    }

    public static double harmonic(int n){
        if(n==1.0){
            return  1.0;
        }
        else{
            return 1.0/n + harmonic(n-1);
        }
    }




    public static void main(String[] args){
        System.out.println(harmonic(4));

    }

}









