package Homework;

import java.util.Scanner;
import java.io.*;

public class PhonebookApp {
    ///home/mike/Desktop/Fall2024/modernProgTecs/txtFilesForPrograms/entries_input.txt
    ///home/mike/Desktop/Fall2024/modernProgTecs/txtFilesForPrograms/entries_output.txt
    public static void main(String[] args) throws IOException {
        pbApp();
    }

    public static void fillArrays(String[] firstNames, String[] lastNames, String[] phoneNumbers, Scanner sc) {
        int i = 0;

        while (sc.hasNext()) {
            firstNames[i] = sc.next();
            lastNames[i] = sc.next();
            phoneNumbers[i] = sc.next();
            i++;
        }
    }

    public static void pbApp() throws IOException {

        Scanner in = new Scanner(System.in);
        String fileName;

        System.out.println("Name of input file: ");
        fileName = in.next();
        File file = new File(fileName);

        Scanner sc = new Scanner(file);


        String[] firstNames = new String[10];
        String[] lastNames = new String[10];
        String[] phoneNumbers = new String[10];

        String fn;
        String ln;
        String pn;
        String choice;
        boolean found = false;
        int index = -1;
        boolean nameExists = false;

        fillArrays(firstNames, lastNames, phoneNumbers, sc);

        System.out.println("Choices:");
        System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");


        while (in.hasNext()) {
            choice = in.next();

            switch (choice) {

                case("l"):
                System.out.println("First name: ");
                fn = in.next();
                System.out.println("Last name: ");
                ln = in.next();

                for (int i = 0; i < 10; i++) {
                    if (firstNames[i] != null && firstNames[i].equals(fn) && lastNames[i].equals(ln)) {
                        found = true;
                        index = i;
                    }
                }
                if (found) {
                    System.out.println(firstNames[index] + " " +lastNames[index] + "'s phone number is " + phoneNumbers[index]);
                    found=false;
                    System.out.println();
                    System.out.println("Choices:");
                    System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");

                } else {
                    System.out.println("Name not found");
                    System.out.println();
                    System.out.println("Choices:");
                    System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                }
                break;
                //------------------------------------------------------------------------------------------------
                case("r"):
                    System.out.println("Phone Number: ");
                    pn=in.next();
                    for (int i = 0; i < 10; i++) {
                        if (phoneNumbers[i]!=null && phoneNumbers[i].equals(pn)) {
                            found = true;
                            index = i;
                        }
                    }
                    if(found){
                        System.out.println(pn + " is " + firstNames[index] + " " + lastNames[index] + "'s phone number");
                        found=false;
                        System.out.println();
                        System.out.println("Choices:");
                        System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                    }
                    else{
                        System.out.println("Phone number not found");
                        System.out.println();
                        System.out.println("Choices:");
                        System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                    }
                    break;
                //--------------------------------------------------------------------
                case("a"):
                    if(phoneNumbers[phoneNumbers.length-1]==null){

                        System.out.println("First name: ");
                        fn=in.next();
                        System.out.println("Last name: ");
                        ln=in.next();

                        for(int i =0;i< phoneNumbers.length;i++) {

                            if (firstNames[i]!=null && firstNames[i].equals(fn) && lastNames[i].equals(ln) ) {
                                nameExists = true;
                                break;
                            }
                        }

                        if(nameExists){
                            System.out.println("That name already exists");
                            System.out.println();
                            System.out.println("Choices:");
                            System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                            nameExists=false;
                            break;
                        }
                        else{
                            System.out.println("Phone number: ");
                            pn=in.next();
                            for(int i =0;i< phoneNumbers.length;i++){
                                if(phoneNumbers[i]==null){
                                    firstNames[i]=fn;
                                    lastNames[i]=ln;
                                    phoneNumbers[i]=pn;
                                    System.out.println("Entry added");
                                    System.out.println();
                                    System.out.println("Choices:");
                                    System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                                    break;
                                }
                            }
                    }
                    }
                    else{
                        System.out.println("Database is full");
                        System.out.println();
                        System.out.println("Choices:");
                        System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                    }
                    break;
                    //--------------------------------------------------------------

                case("c"):

                    System.out.println("First name: ");
                    fn=in.next();
                    System.out.println("Last name: ");
                    ln=in.next();

                    for(int i =0;i< phoneNumbers.length;i++){
                        if(fn.equals(firstNames[i]) && ln.equals(lastNames[i])){
                            found=true;
                            index=i;
                        }
                    }
                    if(found){
                        System.out.println("New phone number: ");
                        pn=in.next();
                        phoneNumbers[index]=pn;
                        System.out.println("Phone number updated");
                        System.out.println();
                        System.out.println("Choices:");
                        System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                    }
                    else{
                    System.out.println("Name not found");
                    System.out.println();
                    System.out.println("Choices:");
                    System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                    }

                    break;
                    //--------------------------------------------------------------
                case("q"):

                    System.out.println("Name of output file: ");
                    fileName= in.next();
                 File output = new File(fileName);
                 PrintWriter writer = new PrintWriter(output);
                 for(int i =0;i< phoneNumbers.length;i++){
                     if(phoneNumbers[i]!=null){
                         writer.println(firstNames[i] + " " + lastNames[i] + " " + " " + phoneNumbers[i]);
                         writer.println();
                     }
                 }
                 writer.close();
                    System.exit(0);
                    //--------------------------------------------------------------------
                default:
                    System.out.println("Invalid choice");
                    System.out.println();
                    System.out.println("Choices:");
                    System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
                    break;

            }
        }
    }
}