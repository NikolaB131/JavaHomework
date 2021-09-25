package pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander",
                "pushkin@yandex.ru", 'M');

        System.out.println(pushkin.toString());
    }
}
