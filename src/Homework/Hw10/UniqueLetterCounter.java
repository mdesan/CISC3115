package Homework.Hw10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class UniqueLetterCounter {

    public static void main(String[] args) throws FileNotFoundException {
        Set<Character> set = new HashSet<>();

            File file = new File("/home/mike/Desktop/input.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            String word;
            while(sc.hasNext()){
                list.add(sc.next());
            }

            for(int i =0;i< list.size();i++){
                word = list.get(i);
                for(int j =0;j<word.length();j++){
                    if(Character.isLetter(word.charAt(j))){
                        set.add(word.charAt(j));
                    }
                }
            }
        System.out.println(set.size());
    }
}
