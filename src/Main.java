import Library.Book;
import Library.Reader;

import java.util.Date;

public static void main(String[] args) {
    // Creating an array of objects
    Reader[] readers = new Reader[3];
    readers[0] = new Reader("Islam", 1234, "IT", new Date(), "123-456-7890");
    readers[1] = new Reader("Amir", 5678, "IT", new Date(), "987-654-3210");
    readers[2] = new Reader("Daniel", 9012, "IT", new Date(), "111-222-3333");

    // Example usage of methods
    readers[0].takeBook(3);
    readers[1].takeBook("OOP", "Calk", "History");
    readers[2].takeBook(new Book("Book1","Author1"), new Book("Book2", "Author2"), new Book("Book3", "Author3"));

    readers[0].returnBook(2);
    readers[1].returnBook("OOP", "Calk");
    readers[2].returnBook(new Book("Book1", "Author1"), new Book("Book2", "Author2"));
}
}