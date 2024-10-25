package Homework.Hw5;

public class Room {
    private double length;
    private double width;

    public Room(double length, double width){
        this.length=length;
        this.width=length;
    }
    public double getArea(){
        return this.length * this.width;
    }

}
