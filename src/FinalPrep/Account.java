package FinalPrep;

public abstract class Account {

    public static void main(String[] args){
        String s = "hi";
        int i = 0;

        try{
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            i = -1;
        }

    }

    private static int nextId = 10001;
    private int id;
    private String name;

    public Account(String name){
        this.name = name;
        this.id = nextId ++;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public abstract Cash getValue();
}



