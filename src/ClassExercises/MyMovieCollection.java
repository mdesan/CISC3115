package ClassExercises;

import java.util.ArrayList;

public class MyMovieCollection  {

   private ArrayList<Movie> myMovies = new ArrayList<>();

   MyMovieCollection(){
   }
   MyMovieCollection(ArrayList<Movie> list ){
       this.myMovies = list;
    }
    MyMovieCollection(Movie movie ){

        this.myMovies.add(movie);
    }


   public void addMovie(Movie m){
       myMovies.add(m);
   }



   public void getCollection(){
       for(int i = 0; i<myMovies.size();i++){
           System.out.println(myMovies.get(i).toString());
       }
   }

   public static void main(String[] args){

       Movie m = new Movie("Spiderman", "action");
       Movie m2 = new Movie("Batman","action");

       MyMovieCollection collection = new MyMovieCollection(m);
       collection.addMovie(m2);
       collection.getCollection();

   }

}
