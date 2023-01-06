import java.time.Year;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String author;
    private Year publicationDate;

    public Book(String name, int pageNumber, String author, Year publicationDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Year getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Year publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageNumber == book.pageNumber && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pageNumber, author, publicationDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.name);
    }


}
