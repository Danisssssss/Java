public class main {
    public static void main(String[] args) {
        Author author = new Author("author-name", "@emal.com", 'm');
        Book book = new Book("name-book", author, 100.0, 10);

        System.out.println(book.toString());
    }
}
