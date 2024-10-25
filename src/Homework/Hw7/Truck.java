package Homework.Hw7;

public class Truck extends Vehicle{

    private int maxCargoWeight, cargoWeight;

    public Truck(int maxCargoWeight){
        super(2);
        this.cargoWeight=0;
        this.maxCargoWeight=maxCargoWeight;
    }

    public Truck(int numSeats,int maxCargoWeight){
        super(numSeats);
        this.maxCargoWeight=maxCargoWeight;
        this.cargoWeight=0;

    }

    public int getMaxCargoWeight(){
        return this.maxCargoWeight;
    }
    public int getCargoWeight(){
        return this.cargoWeight;
    }

    public boolean addCargo(int weight){
        if(cargoWeight+weight<=maxCargoWeight){
            this.cargoWeight+=weight;
            return true;
        }
        return false;
    }
}
