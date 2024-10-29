package Homework.Hw8;

public class InvalidTimeException extends Exception{

    public String invalidTime;

    public InvalidTimeException(String invalidTime){
        super("invalid time: " + invalidTime);
        this.invalidTime = invalidTime;
    }
    public InvalidTimeException(){

    }


    public String getInvalidTime(){

        return invalidTime;

    }



}
