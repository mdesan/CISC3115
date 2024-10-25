package Homework.Hw5;


public class IntStatistician {

    private int count=0,
            sum=0,
            max=Integer.MIN_VALUE,
            min=Integer.MAX_VALUE;

    public void record(int number){

      this.count++;
      this.sum+=number;

      if(number<this.min){
          this.min=number;
      }
      if(number>this.max){
          this.max=number;
      }

    }
    public int count(){
        return this.count;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        if(this.count==0){
            return 0.0;
        }
        return (double)this.sum /(double)this.count;
    }
    public int min(){
        return this.min;
    }
    public int max(){
        return this.max;
    }
}
