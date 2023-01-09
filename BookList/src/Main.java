import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Head First Java",656,"Kathy Sierra",2003);
        bookList.add(book1);
        Book book2 = new Book("Java: A Beginner's Guide",720,"Herbert Schildt",2018);
        bookList.add(book2);
        Book book3 = new Book("Java for Dummies",434,"Barry Burd",2015);
        bookList.add(book3);
        Book book4 = new Book("Effective Java",416,"Joshua Bloch",2017);
        bookList.add(book4);
        Book book5 = new Book("Head First Design Patterns",669,"Eric Freeman",2021);
        bookList.add(book5);
        Book book6 = new Book("Spring in Action",520,"Craig Walls",2018);
        bookList.add(book6);
        Book book7 = new Book("Clean Code",464,"Robert Martin",2008);
        bookList.add(book7);
        Book book8 = new Book("Test Driven: TDD and Acceptance TDD for Java Developers",470,"Lasse Koskela",2007);
        bookList.add(book8);
        Book book9 = new Book("Test-Driven Java Development",286,"Alex Garcia",2015);
        bookList.add(book9);
        Book book10 = new Book("Thinking in Java",689,"Bruce Eckel",2014);
        bookList.add(book10);

        HashMap<String, String> bookMapList = new HashMap<>();
        bookList.stream().forEach(book -> {
            bookMapList.put(book.getName(), book.getAuthor());
        });
        bookMapList.entrySet().stream().forEach(x -> System.out.println("Book Name: " + x.getKey() + ", Author: " + x.getValue()));

        System.out.println("******************************************************");

        bookList.stream().filter(book -> book.getPageNumber()>500).forEach(x -> System.out.println(x));
    }
}