package Homework.Hw10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueWordPrinter {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/home/mike/Desktop/input.txt");
        Scanner sc = new Scanner(file);
        //treeSet is like the regular set but it specifically sorts the elements by its natural sorting order.
        TreeSet<Object> words = new TreeSet<>();

        while(sc.hasNext()){
            words.add(sc.next());
        }

            for(Object word : words){
                System.out.println(word);

            }
    }
}
