import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();
        allBooks(bookSet);


        Set<Book> treeSet = new TreeSet<>((book, t1) -> {
            if(book.getPageNumber()>t1.getPageNumber())
                return 1;
            else if (book.getPageNumber()<t1.getPageNumber())
                return -1;
            else
                return 0;
        });
        allBooks(treeSet);
    }

    private static void allBooks(Set<Book> bookSet) {
        bookSet.add(new Book("Head First Java",656,"Bert Bates", Year.of(2003)));
        bookSet.add(new Book("Java: A Beginner's Guide",720,"Herbert Schildt",Year.of(2018)));
        bookSet.add(new Book("Java For Dummies",434,"Barry A. Burd",Year.of(2015)));
        bookSet.add(new Book("Effective Java",416,"Joshua Block",Year.of(2017)));
        bookSet.add(new Book("Clean Code",464,"Robert C. Martin",Year.of(2018)));
        System.out.println(bookSet);
    }
}