package Homework.Hw7;

public class Vehicle {

    private int numSeats;
    private int numPassengers;

    public Vehicle(int numSeats){
        this.numSeats=numSeats;
        this.numPassengers=0;
    }
    public int getNumSeats(){
        return this.numSeats;
    }

    public int getNumPassengers(){
        return this.numPassengers;
    }

    public boolean addPassenger(){
        if(getNumPassengers()<getNumSeats()){
            this.numPassengers++;
            return true;
        }
        return false;
    }
}
