package Homework.Hw5;
import java.util.Scanner;
public class Rectangle {
//rememeber to make deep copies and defensve copies
    private MutablePoint location; //rectangles upppe left corner
    private int width;
    private int height;

    Rectangle(int width, int height){
        if(width<0 || height<0){

        if(width <0){
            this.width=0;
        }
        else {
            this.width=width;
        }
        if(height<0){
            this.height=0;
        }
        else {
            this.height=0;
        }
            this.location = new MutablePoint(0,0);
        }
        else{
            this.height=height;
            this.width=width;
            this.location = new MutablePoint(0,0);
        }


    }
    Rectangle(MutablePoint location, int width, int height){
        if(width<0 || height<0){

            if(width <0){
                this.width=0;
            }
            else {
                this.width=width;
            }
            if(height<0){
                this.height=0;
            }
            else {
                this.height=0;
            }
            this.location = new MutablePoint(location.getX(), location.getY());
        }
        else{
            this.height=height;
            this.width=width;
            this.location = new MutablePoint(location.getX(), location.getY());
        }
    }

    Rectangle(Rectangle original){
        this.width = original.getWidth();
        this.height = original.getHeight();
        this.location = new MutablePoint(original.getLocationX(), original.getLocationY());

    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public MutablePoint getLocation(){
        return new MutablePoint(this.location);
    }
    public int getLocationX(){
        return location.getX();
    }
    public int getLocationY(){
        return location.getY();
    }
    public void setLocation(MutablePoint location){
        this.location = new MutablePoint(location);
    }
    public void setLocationX(int x){
        this.location.setX(x);
    }
    public void setLocationY(int y){
        this.location.setY(y);
    }
    public void setWidth(int width){
        if(width <0){
            this.width=0;
        }
        else{this.width=width;}
    }
    public void setHeight(int height){
        if(height<0){
            this.height=0;
        }
        else{this.height=height;}


    }
    public int getArea(){
        return (this.height)*(this.width);
    }
    public int getPerimeter(){
        return (2*this.height)+(2*this.width);
    }
    public double getDiagonal(){
        return Math.sqrt((Math.pow(this.height,2))+(Math.pow(this.width,2)));
    }
    public boolean isSquare(){
        return this.height == this.width;
    }
    public String toString(){
        return "rectangle at " + location.toString() + " with width " + this.width + " and height " + this.height + ".";
    }
    public boolean isEqualTo(Rectangle other){
        return this.height == other.getHeight() && this.width==other.getWidth() && other.location.isEqualTo(this.location);
    }
    public static Rectangle getUnitSquare(){

        return new Rectangle(new MutablePoint(0,1),1,1);
    }
    public static Rectangle read(Scanner sc){
        return new Rectangle(MutablePoint.read(sc),sc.nextInt(),sc.nextInt());
    }


}
