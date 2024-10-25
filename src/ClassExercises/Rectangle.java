package ClassExercises;

import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Rectangle {

    private double width;
    private double height;

    Rectangle(){
    }

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (2*this.width)+(2*this.height);
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4,40);
        Rectangle r3 = new Rectangle(3.5,35.9);

        ArrayList<Rectangle> list = new ArrayList<>();
        list.add(r1);
        list.add(r2);
        list.add(r3);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i).getWidth());
            System.out.println(list.get(i).getHeight());
            System.out.println(list.get(i).getArea());
            System.out.println(list.get(i).getPerimeter());
            System.out.println("-----------------------");

        }


    }

}
