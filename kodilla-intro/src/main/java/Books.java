public class Books {
    private String author;
    private String title;

    public Books(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Books of(String author, String title) {
        Books books = new Books(author, title);
        System.out.println("Author of the book is: " + author + "and the title is: " + title);
        return books;
    }

    public static void main(String[] args) {
        Books.of("Isaac Asimov", "The Galaxy");
    }
}

//public class Book {
//    private String author;
//    private String title;
//
//    public Book(String author, String title){
//        this.author = author;
//        this.title = title;
//    }
//
//    public static Book of (String author, String title){
//        System.out.println(author + title);
//        return null;
//    }
//    public static void main(String[] args) {
//        Book book = Book.of("A", "B");
//
//    //    Book.of("Test", "Test2");
//    }
//}