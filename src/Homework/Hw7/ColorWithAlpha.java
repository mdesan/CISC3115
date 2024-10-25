package Homework.Hw7;

public class ColorWithAlpha extends Color{

    private int alpha;

    public ColorWithAlpha(){
        super();
        this.alpha=255;
    }
    public ColorWithAlpha(int red,int green, int blue, int alpha){
        super(red, green, blue);
        this.alpha=alpha;
    }

    public int getAlpha(){
        return this.alpha;
    }

    public void increment(){
        super.increment();
        if(this.alpha<255){
            this.alpha++;
        }
    }

    public void decrement(){
        super.decrement();
        if(this.alpha>0){
            this.alpha--;
        }
    }

    public String toString(){
        return "rgba(" + this.getRed() + ", " + this.getGreen()  +", " +  this.getBlue()  +", " +  this.getAlpha() + ")";
    }

}
