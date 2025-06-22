public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book(1, "The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));
        library.addBook(new Book(4, "Pride and Prejudice", "Jane Austen"));

        System.out.println("All Books:");
        library.displayBooks();

        System.out.println("\nLinear Search for '1984':");
        Book found = library.linearSearchByTitle("1984");
        System.out.println(found != null ? found : "Book not found.");

        System.out.println("\nBinary Search for '1984':");
        Book foundBinary = library.binarySearchByTitle("1984");
        System.out.println(foundBinary != null ? foundBinary : "Book not found.");
    }
}
