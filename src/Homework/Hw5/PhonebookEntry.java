package Homework.Hw5;
import java.util.Scanner;
public class PhonebookEntry {
    private Name name;
    private PhoneNumber number;

    public PhonebookEntry(Name name, PhoneNumber number){
        this.name = new Name(name.getFirst(), name.getLast());
        this.number = new PhoneNumber(number.toString());
    }
    public PhonebookEntry(PhonebookEntry original){
        this.name = new Name(original.getName());
        this.number = new PhoneNumber(original.getPhoneNumber().toString());
    }

    public Name getName(){
        return new Name(this.name.getFirst(), this.name.getLast());
    }
    public PhoneNumber getPhoneNumber(){
        return new PhoneNumber(this.number.toString());
    }

    public void setName(Name name){
        this.name = new Name(name.getFirst(),name.getLast());
    }

    public void setPhoneNumber(PhoneNumber phoneNumber){
        this.number = new PhoneNumber(phoneNumber.toString());
    }
    public String toString(){
        return this.name.toString() + " " + this.number.toString();
    }
    public boolean isEqualTo(PhonebookEntry other){
        return (this.name.isEqualTo(other.getName())) && (this.number.isEqualTo(other.getPhoneNumber()));
    }

    public static PhonebookEntry read(Scanner scanner){
        return new PhonebookEntry(new Name(scanner.next(), scanner.next()),new PhoneNumber(scanner.next()));
    }
   }