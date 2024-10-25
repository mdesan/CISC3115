package Homework.Hw5;

public class Apartment {

    private String apartmentNumber;
    private int numRooms;
    private Room[] rooms;

    public Apartment(String apartmentNumber, int maxRooms){
        this.apartmentNumber = apartmentNumber;
        this.numRooms =0;
        this.rooms = new Room[maxRooms];
    }
    public Apartment(Apartment original){
        this.numRooms=original.getNumRooms();

    }
    public int getNumRooms(){
        return this.numRooms;
    }
    public boolean addRoom(Room room){
        if(this.numRooms==rooms.length){
            return false;
        }
        else{

        }
    }



}
