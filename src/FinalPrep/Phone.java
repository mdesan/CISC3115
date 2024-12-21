package FinalPrep;

public abstract class Phone {
    private String phoneNumber;

    public Phone(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "#(" + this.phoneNumber + ")";
    }

    public abstract boolean createConnection(Network network);
    public abstract void closeConnection();
}


