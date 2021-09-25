package lab2;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("yay");
        book1.setAuthor("Pushkin");
        book1.setYear("1920");
        System.out.printf("Имя книги: %s\nАвтор книги: %s\nГод издания книги: %s",
                book1.getName(), book1.getAuthor(), book1.getYear());
    }
}
