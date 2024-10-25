package Homework.Hw7;

public class GeometricSequence extends Sequence{

    private int constant;

    GeometricSequence(){

        super(1);
        this.constant=2;

    }

    GeometricSequence(int constant){
        super(1);
        this.constant=constant;
    }

    GeometricSequence(int start, int constant){
        super(start);
        this.constant=constant;

    }

    public int next(){
        int x = super.current;
        super.current *= this.constant;
        return x;
    }

}
