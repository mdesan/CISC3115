package Homework.Hw7;

public class Color {

    private int red, green ,blue;

    public Color(){
        this.red=255;
        this.green=255;
        this.blue=255;
    }

    public Color(int red,int green,int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed(){
        return this.red;
    }
    public int getGreen(){
        return this.green;
    }
    public int getBlue(){
        return this.blue;
    }

    public void increment(){
        if(this.red<255){
            this.red++;
        }
        if(this.green<255){
            this.green++;
        }
        if(this.blue<255){
            this.blue++;
        }
    }

    public void decrement(){
        if(this.red>0){
            this.red--;
        }
        if(this.green>0){
            this.green--;
        }
        if(this.blue>0){
            this.blue--;
        }
    }
}
