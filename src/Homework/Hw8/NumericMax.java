package Homework.Hw8;

import java.util.Scanner;

public class NumericMax {

    public static void main(String[] args){

        double max = Double.NEGATIVE_INFINITY;

        for(int i =0;i< args.length;i++){
            try{
                if(Double.parseDouble(args[i]) > max){
                    max=Double.parseDouble(args[i]);
                }
            }
            catch(NumberFormatException e){
                System.out.println("skipping " + args[i]);
            }
        }

        if(max == Double.NEGATIVE_INFINITY){
            System.out.println("no numeric arguments");
        }else{
            System.out.println("max = " + max);
        }
    }
}
