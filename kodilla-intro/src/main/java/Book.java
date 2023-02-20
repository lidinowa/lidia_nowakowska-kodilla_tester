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
//        Book book = Book.of("test", "hihi");
//
//    //    Book.of("lila", "ksionszka");
//    }
//}