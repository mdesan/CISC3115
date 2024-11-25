package Homework.Hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Time24Sorter {

    public static void main(String[] args) throws FileNotFoundException {

        File times = new File("/home/mike/Desktop/times.txt");
        File sortedtimes = new File("/home/mike/Desktop/sortedtimes.txt");
        PrintWriter writer = new PrintWriter(sortedtimes);
        ArrayList<Time24> list = new ArrayList<>();
        Scanner sc = new Scanner(times);

        read(sc,list);

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            writer.println(list.get(i).toString());
        }
        writer.close();


        }

        public static void read(Scanner sc,ArrayList list){

        int amount = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<amount;i++){
            list.add(Time24.parse(sc.nextLine()));
        }

    }





}
