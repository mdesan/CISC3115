package JavaPractice;

public class Circle extends Shape {

    public double radius=1;

    @Override
    public double getArea(){
        return 3.14159 * this.radius * this.radius;
    }
}
