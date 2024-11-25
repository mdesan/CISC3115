package Homework.Hw5;

import java.io.PrintStream;
import java.util.Scanner;

public class Phonebook {

    PhonebookEntry[] phonebook;

    public Phonebook(){
        this.phonebook = new PhonebookEntry[10];
    }
    public Phonebook(int cap){
        this.phonebook = new PhonebookEntry[cap];
    }

    public int getNumEntries(){
        int count=0;
        for(int i = 0; i< phonebook.length;i++){
            if(this.phonebook[i]==null){
                return count;
            }
            else{
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty(){
        if(this.phonebook[0]==null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(this.phonebook[phonebook.length-1]!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean containsName(Name name){

        for(int i = 0;i < this.phonebook.length;i++){
            if(this.phonebook[i]!=null && this.phonebook[i].getName().isEqualTo(name)){
                return true;
            }
            }
        return false;
        }
    public boolean containsPhoneNumber(PhoneNumber phoneNumber) {

        for(int i = 0;i<this.phonebook.length;i++){
            if(this.phonebook[i]!=null && this.phonebook[i].getPhoneNumber().isEqualTo(phoneNumber)){
                return true;
            }
        }
        return false;
    }
    public boolean addEntry(PhonebookEntry entry){
        if(this.isFull() || this.containsName(entry.getName())){
            return false;
        }
        else{
            for(int i =0;i<this.phonebook.length; i++){
                if(this.phonebook[i]==null){
                    phonebook[i] = new PhonebookEntry(entry);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean addEntry(Name name, PhoneNumber phoneNumber){
        if(this.isFull() || this.containsName(name)){
            return false;
        }
        else{
            for(int i =0;i<this.phonebook.length; i++){
                if(this.phonebook[i]==null){
                    phonebook[i] = new PhonebookEntry(name, phoneNumber);
                    return true;
                }
            }
        }
        return false;
    }

    public PhoneNumber lookup(Name name){
        for(int i =0;i<phonebook.length;i++){
            if(phonebook[i] != null && phonebook[i].getName().isEqualTo(name)){
                return new PhoneNumber(phonebook[i].getPhoneNumber().toString());
            }
        }
        return null;
    }

    public Name reverseLookup(PhoneNumber phoneNumber){
        for(int i =0;i< phonebook.length;i++){
            if(phonebook[i] != null && phonebook[i].getPhoneNumber().isEqualTo(phoneNumber)){
                return new Name(phonebook[i].getName());
            }
        }
        return null;
    }

    public boolean changeNumber(Name name, PhoneNumber newPhoneNumber){
        if(!this.containsName(name)){
            return false;
        }
        else{
            for(int i =0;i< phonebook.length;i++){
                if(phonebook[i] != null && phonebook[i].getName().isEqualTo(name)){
                    phonebook[i].setPhoneNumber(newPhoneNumber);
                    return true;
                }
            }
        }
        return false;
    }

    public void read(Scanner sc){
        PhonebookEntry phonebookEntry;
        int i=0;
        while(sc.hasNext() && !this.isFull()){
            phonebookEntry = new PhonebookEntry(PhonebookEntry.read(sc));
            if(phonebook[i] == null && !this.containsName(phonebookEntry.getName())){
                phonebook[i] = new PhonebookEntry(phonebookEntry);
                i++;
            }
        }
    }

    public void print(PrintStream ps){

        for(int i=0;i< phonebook.length;i++) {
            if(phonebook[i]!=null){
                ps.println(phonebook[i].getName().toString() + " " + phonebook[i].getPhoneNumber().toString());
            }

        }
    }
    }
















