package Homework.Hw9;

public class Time24 implements Comparable<Time24>{

    private int hour, minute,second;

    public Time24(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

  public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }



    public static Time24 parse(String timeString){
        String[] tokens = timeString.split(":");

        int hour=Integer.parseInt(tokens[0]);
        int minute=Integer.parseInt(tokens[1]);
        int second=Integer.parseInt(tokens[2]);

                return new Time24(hour,minute,second);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o==null||getClass()!=o.getClass()){
            return false;
        }
        Time24 time24 = (Time24) o;

        return this.hour==((Time24) o).getHour() && this.minute==((Time24) o).getMinute()
                && this.second==((Time24) o).getSecond();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(hour, minute, second);
    }

    @Override
    public String toString(){

        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }


    @Override
    public int compareTo(Time24 time24) {
        if(this.hour< time24.getHour()){
            return -1;
        }
        if(this.hour> time24.getHour()){
            return 1;
        }
        else{
            if(this.minute<time24.getMinute()){
                return -1;
            }
            if(this.minute>time24.getMinute()){
                return 1;
            }
            else{
                if(this.second< time24.getSecond()){
                    return -1;
                }
                if(this.second>time24.getSecond()){
                    return 1;
                }
                return 0;
            }
        }
    }
}
