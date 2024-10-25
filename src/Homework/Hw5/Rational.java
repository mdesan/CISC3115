package Homework.Hw5;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator){
        this.numerator=numerator;
        this.denominator=1;
    }

    public Rational(int numerator,int denominator){

        int gcd = gcd(numerator,denominator);
        this.numerator=(numerator)/(gcd);
        this.denominator=(denominator)/(gcd);

        if(this.numerator<0 && this.denominator<0){
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        else if(this.denominator <0){
            this.denominator=-this.denominator;
            this.numerator=-this.numerator;
        }
        if(numerator==0){
            this.denominator=1;
        }
    }

    public Rational(String rationalString){
        String[] split = rationalString.split("/");
        int numerator=Integer.parseInt(split[0]);
        int denominator=Integer.parseInt(split[1]);
        int gcd = gcd(numerator,denominator);
        this.numerator=(numerator)/(gcd);
        this.denominator=(denominator)/(gcd);

        if(this.numerator<0 && this.denominator<0){
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        else if(this.denominator <0){
            this.denominator=-this.denominator;
            this.numerator=-this.numerator;
        }
        if(numerator==0){
            this.denominator=1;
        }

    }

    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public String toString(){
        if(this.denominator==1){
            return Integer.toString(this.numerator);
        }
        return this.numerator + "/" + this.denominator;
    }
    public boolean isEqualTo(Rational other){
        return (this.numerator == other.getNumerator()) && (this.denominator == other.getDenominator());
    }
    public boolean isPositive(){
        if(this.numerator==0){
            return false;
        }
        return (this.numerator >0 && this.denominator >0) || (this.numerator <0 && this.denominator <0) ;
    }
    public boolean isNegative(){
        if(this.numerator==0){
            return false;
        }
        return !isPositive();
    }
    public Rational plus(Rational other){
        int num=
                (this.numerator * other.getDenominator())+(this.denominator * other.getNumerator());
        int den=
                (this.denominator*other.getDenominator());

        return new Rational(num,den);
    }
    public Rational minus(Rational other){
        int num=
                (this.numerator * other.getDenominator())-(this.denominator * other.getNumerator());
        int den=
                (this.denominator*other.getDenominator());
        return new Rational(num,den);
    }
    public Rational times(Rational other){
        int num=
                this.numerator * other.getNumerator();
        int den=
                this.denominator * other.getDenominator();
        return new Rational(num,den);
    }
    public Rational dividedBy(Rational other){
        int num=
                this.numerator * other.getDenominator();
        int den=
                this.denominator * other.getNumerator();
        return new Rational(num,den);
    }
    public Rational getNegation(){
        return new Rational(-this.numerator,this.denominator);
    }
    public Rational getAbsoluteValue(){
        if(this.numerator<0){
            return new Rational(-this.numerator,this.denominator);
        }
        return new Rational(this.numerator,this.denominator);
    }
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        // perform the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
