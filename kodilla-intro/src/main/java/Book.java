public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        System.out.println("Author of the book is: " + author + "and the title is: " + title);
        return book;
    }

    public static void main(String[] args) {
        Book.of("Isaac Asimov", "The Galaxy");
    }
}

//       different way of resolving exercise:
//
//public class Book {
//    private String author;
//    private String title;
//
//    // public Book(String author, String title) {
//    //     this.author = author;
//    //     this.title = title;
//    // }
//
//    public static Book of(String author, String title) {
//        // Book book = new Book(author, title);
//        Book book = new Book();
//        book.author = author;
//        book.title = title;
//        return book;
//    }
//
//    public static void main(String[] args) {
//        Book book = Book.of("Isaac Asimov", "The Galaxy");
//        System.out.println("Author of the book is: " + book.author + " and the title is: " + book.title);
//    }
//}