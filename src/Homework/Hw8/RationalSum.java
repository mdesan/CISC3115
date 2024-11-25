package Homework.Hw8;

import Homework.Hw5.Rational;

public class RationalSum {

    public static void main(String[] args){

        Rational r = new Rational(0);
        for(String arg: args){
            try{
                if(isInt(arg)){
                    r = r.plus(new Rational(Integer.parseInt(arg)));
                }

                else{
                    r = r.plus(new Rational(arg));
                }
            }
            catch(Exception e){
                System.out.println("skipping " + (arg));
            }
        }

        String sum = "sum = " + r.toString();
        System.out.println(sum);

    }

    public static boolean isInt(String arg){
        try{
            int i = Integer.parseInt(arg);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
