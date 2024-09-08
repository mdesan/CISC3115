import java.io.*;
import java.util.Scanner;

public class Averages {

    public static void main(String[] args)throws FileNotFoundException{

        File file = new File("/home/mike/Desktop/Fall2024/modernProgTecs/numbers.txt");
        Scanner sc = null;
        Scanner sc2 = null;
        avg(file,sc,sc2);

    }

    public static void avg(File file, Scanner sc,Scanner sc2)throws FileNotFoundException{

        sc = new Scanner(file);
        sc2 = new Scanner(file);
        double sum=0;
        String list ="";
        int header;
        int sets=0;

        while(sc.hasNextInt()){
            header=sc.nextInt();
            sc2.nextInt();
            list = sc2.nextLine();

            for(int i =0;i< header;i++){
                sum+=sc.nextInt();
            }
            System.out.println("The average of the " + header + " integers"+ list+ " is " + (sum/header));
            list="";
            sum=0;
            sets++;
        }
        System.out.println(sets + " sets of numbers processed");
    }
}
