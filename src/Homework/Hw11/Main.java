package Homework.Hw11;

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



    public static void main(String[] args){
        System.out.println(fact(4));
        System.out.println(fib(5));
    }

}
