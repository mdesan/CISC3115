package Homework.Hw7;

public class ArithmeticSequence extends Sequence{

    private int difference;

    public ArithmeticSequence(){
        super();
        this.difference=1;
    }

    public ArithmeticSequence(int difference){
        super();
        this.difference=difference;

    }
    public ArithmeticSequence( int start, int difference){
        super(start);
        this.difference=difference;

    }
    @Override
    public int next(){
        int x = super.current;
        super.current += this.difference;
        return x;
    }

    public static void main(String[] args){
        ArithmeticSequence s = new ArithmeticSequence(5,4);

        s.printNext(5);

    }
}
