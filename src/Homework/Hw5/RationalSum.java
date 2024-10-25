package Homework.Hw5;

public class RationalSum {

    public static void main(String[] args){

        Rational r = new Rational(0);
        for (String arg : args) {
            r = r.plus(new Rational(arg));
        }
        System.out.println(r);
    }
}
