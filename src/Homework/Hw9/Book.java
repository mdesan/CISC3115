package Homework.Hw9;

public class Book implements Comparable<Book>{
    private String title, author;
    private int publicationYear;
    private double price;

    public Book(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    @Override
    public int compareTo(Book book) {
       if(this.publicationYear<book.publicationYear){
           return -1;
       }
       if(this.publicationYear> book.publicationYear){
           return 1;
       }
       else{
           if(this.price<book.price){
               return -1;
           }
           if(this.price>book.price){
               return 1;
           }
           else{
               if(this.author.compareTo(book.author)<0){
                   return -1;
               }
               if(this.author.compareTo(book.author)>0){
                   return 1;
               }
               else{
                   if(this.title.compareTo(book.title)<0){
                       return -1;
                   }
                   if(this.title.compareTo(book.title)>0){
                       return 1;
                   }
                   else{
                       return 0;
                   }
               }
           }
       }

    }
}
