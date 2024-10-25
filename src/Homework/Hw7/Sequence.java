package Homework.Hw7;

public abstract class Sequence {
    protected int current;

    public Sequence(){
        this.current=0;
    }
    public Sequence(int start){
        this.current = start;
    }
    public abstract int next();
    //goal of this method is to return the current value of the sequence and advance
    // the current value to the next value of the sequence.

    public void printNext(int n){

            for(int i =0;i<n;i++){
                System.out.println(next());
            }
    }
}
