package Homework.Hw5;
import java.util.Scanner;
public class Name {

    private String first;
    private String last;

    public Name(String first, String last){
        this.first=first;
        this.last=last;
    }

    public Name(Name original){
        this.first = original.getFirst();
        this.last = original.getLast();
    }
    public String getFirst(){
        return this.first;
    }
    public String getLast(){
        return this.last;
    }
    public void setFirst(String first){
        this.first=first;
    }
    public void setLast(String last){
        this.last=last;
    }
    public String toString(){
        return this.first + " " + this.last;
    }
    public String getInitials(){
        return this.first.charAt(0) + "." + this.last.charAt(0) + ".";
    }
    public boolean isEqualTo(Name name){
        return this.first.equals(name.getFirst()) && this.last.equals(name.getLast());
    }
    public static Name read(Scanner scanner){
        return new Name(scanner.next(),scanner.next());
    }
}
