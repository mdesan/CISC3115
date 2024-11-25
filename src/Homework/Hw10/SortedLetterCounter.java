package Homework.Hw10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortedLetterCounter {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("home/mike/Desktop/input.txt");

        Scanner sc = new Scanner(file);

        Set<Character> letters = new HashSet<>();

        ArrayList<String> words = new ArrayList<>();

        while(sc.hasNext()){
            words.add(sc.next());
        }






    }

}
