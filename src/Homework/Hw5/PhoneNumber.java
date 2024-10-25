package Homework.Hw5;
import java.util.Scanner;
public class PhoneNumber {

    private String number;

    public PhoneNumber(String fullNumber){
        this.number= fullNumber;
    }
    public PhoneNumber(int areaCode, int prefix, int LineNumber){
        this.number = String.format("%03d-%03d-%04d", areaCode, prefix, LineNumber);

    }

//123-456-7890
    public int getAreaCode(){
         return Integer.parseInt(this.number.substring(0,3));
    }
    public int getPrefix(){
        return Integer.parseInt(this.number.substring(4,7));
    }
    public int getLineNumber(){
        return Integer.parseInt(this.number.substring(8,12));
    }

    public String toString(){
        return this.number;
    }
    public boolean isEqualTo(PhoneNumber other){
        return this.number.equals(other.toString());
    }
    public static PhoneNumber read(Scanner scanner){
        return new PhoneNumber(scanner.next());
    }



}
