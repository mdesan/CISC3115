
package Homework.Hw5;
import java.util.Scanner;
import java.io.*;
public class StatisticsPrinter {
    public static void main(String[] main)throws java.io.FileNotFoundException{
        File file = new File("/home/mike/Desktop/Fall2024/modernProgTecs/txtFilesForPrograms/integers.txt");
        Scanner scanner = new Scanner(file);
        IntStatistician s = new IntStatistician();
        readAndPrint(scanner,s);
    }
    public static void readAndPrint(Scanner scanner, IntStatistician s)throws java.io.FileNotFoundException{

        while(scanner.hasNextInt()) {
            s.record(scanner.nextInt());
        }

        System.out.println("count: " + s.count());
        System.out.println("sum: " + s.sum());
        System.out.println("average: " + s.average());
        System.out.println("min: " + s.min());
        System.out.println("max: " + s.max());

        }


    }

