package JavaPractice;

public class Rectangle extends Shape{

    public double width = 2;

    public double height = 2;

    @Override
    public double getArea(){
        return this.width * this.height;
    }
}
