package lbs;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static final BookManager instance = new BookManager();

    private List<Book> books = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    private BookManager() {
        // Add initial books
        books.add(new Book("978-0156012195", "The Little Prince", "Antoine de Saint-Exupéry", "Children's Literature", "Reynal & Hitchcock", 1943));
        books.add(new Book("978-0141439760", "Alice's Adventures in Wonderland", "Lewis Carroll", "Fantasy", "Macmillan", 1865));
        books.add(new Book("978-0451524935", "1984", "George Orwell", "Dystopian Fiction", "Secker & Warburg", 1949));
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    public void updateBook(int index, Book b) {
        if (index >= 0 && index < books.size()) {
            books.set(index, b);
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public int getBookCount() {
        return books.size();
    }

    public int getIssuedBookCount() {
        int count = 0;
        for (Book b : books) {
            if (!b.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        String lowerQuery = query.toLowerCase();
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(lowerQuery) ||
                b.getAuthor().toLowerCase().contains(lowerQuery) ||
                b.getIsbn().toLowerCase().contains(lowerQuery) ||
                b.getGenre().toLowerCase().contains(lowerQuery) ||
                b.getPublisher().toLowerCase().contains(lowerQuery)) {
                result.add(b);
            }
        }
        return result;
    }

    public Book getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }

    public Book findBookByISBN(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }
}