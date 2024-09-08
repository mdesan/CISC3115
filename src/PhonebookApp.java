import java.util.Scanner;
import java.io.*;

public class PhonebookApp {
    ///home/mike/Desktop/Fall2024/modernProgTecs/txtFilesForPrograms/entries_input.txt
    public static void main(String[] args) throws FileNotFoundException {
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


    public static void pbApp() throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        String fileName;

        System.out.println("Name of input file: ");
        fileName = in.next();
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        PrintWriter out = new PrintWriter(file);

        String[] firstNames = new String[10];
        String[] lastNames = new String[10];
        String[] phoneNumbers = new String[10];

        String fn;
        String ln;
        String pn;
        String choice;
        boolean found = false;
        int index = -1;

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
                        System.out.println("Phone number: ");
                        pn=in.next();

                        for(int i=0;i<=10;i++){
                            if(){
                                
                            }
                        }

                    }

                    else{
                        System.out.println("Database is full");
                        System.out.println();
                        System.out.println("Choices:");
                        System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");


                    }
                    //--------------------------------------------------------------
                case("q"):
                    System.exit(0);

                    //--------------------------------------------------------------------


            }

        }
    }
}

