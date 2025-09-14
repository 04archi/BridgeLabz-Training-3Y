public class Book1 {
    static String libraryName = "City Library";

    final String isbn;
    String title;
    String author;

    public Book1(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book1) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("Java Programming", "Author A", "ISBN001");
        Book1 book2 = new Book1("Python Programming", "Author B", "ISBN002");

        Book1.displayLibraryName();
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
