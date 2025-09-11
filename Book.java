//America Chavez
//9/9/2025
//CPSC-39-12705

public class Book {

    //data variables, they describe our Book objects in the computer
    public String title;
    public String author;
    public int pages; 

    //constructor 
    public Book () {
        this.title = "Title";
        this.author = "Best Author";
        this.pages = 10;
    }

    //nondefault constructor
    public Book (String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    //setters - accessors
    public void setTitle (String title) {
        this.title = title;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public void setPages (int pages) {
        this.pages = pages;
    }

    //getters - mutators
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override 
    public String toString() {
        return title + ", " + author + ", " + pages;
    }

} //end Book class