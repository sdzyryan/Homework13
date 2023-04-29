public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book (Author author, String nameBook, int year) {
        this.author = author;
        this.nameBook = nameBook;
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getNameBook(){

        return this.nameBook;
    }

    public int getYear() {

        return this.year;
    }

    public void setYear(int year) {

        this.year = year;
    }
}
