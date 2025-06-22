import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Library is full.");
        }
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle));

        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null; 
    }
}
