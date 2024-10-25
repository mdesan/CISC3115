package ClassExercises;

public class Movie {

    private String genre;
    private String name;

    Movie(){
    }



    Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }

    public String toString(){
        return this.name;
    }

    public static void main(String[] args){

    }

}
