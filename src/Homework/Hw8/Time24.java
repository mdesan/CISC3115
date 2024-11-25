package Homework.Hw8;

public class Time24 implements Comparable<Time24> {
    private int hour, minute, second;

    public Time24(int hour, int minute, int second) throws InvalidTimeException {

        if((hour<0 || hour>23) || (minute <0 || minute>59) || second <0 || second >59){
            throw new InvalidTimeException("invalid time: " + hour + ": " + minute + ": " + second);
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }


    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static Time24 parse(String timeString) throws InvalidTimeException {
        String[] tokens = timeString.split(":");

        try{
            int hour, minute, second;
            hour = Integer.parseInt(tokens[0]);
            minute = Integer.parseInt(tokens[1]);
            second = Integer.parseInt(tokens[2]);

            return new Time24(hour, minute, second);
        }
        catch(NumberFormatException e){
            throw new InvalidTimeException("invalid time: " + timeString);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Time24) {
            Time24 other = (Time24) o;
            return this.hour == other.hour && this.minute == other.minute && this.second == other.second;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(hour, minute, second);
    }

    @Override
    public String toString() {
        return (hour < 10 ? "0" : "") + hour + ":" + (minute < 10 ? "0" : "") + minute + ":" + (second < 10 ? "0" : "") + second;
    }

    @Override
    public int compareTo(Time24 other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        } else if (this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        } else {
            return Integer.compare(this.second, other.second);
        }
    }
}