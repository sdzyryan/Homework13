import java.util.Objects;

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

    public String toString() {
        return "Автор книги - " + author + "Название книги - " + nameBook + ". Год издания - "
                + year + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}
