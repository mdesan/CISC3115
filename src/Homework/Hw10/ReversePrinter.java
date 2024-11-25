package Homework.Hw10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class ReversePrinter {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/mike/Desktop/words.txt");
        Stack <String> stack = new Stack<>();
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            stack.add(sc.next());
        }

        while(!stack.isEmpty())
            if(stack.size()!=1){
                System.out.print(stack.pop() + " ");
            }
            else{
                System.out.println(stack.pop());
            }




    }
}
