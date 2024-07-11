package TaskFour;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Little Women. Good Wives",
                new Author("Louisa May Alcott", "Female",

                        "LouisaMayAlcott@gmail.com"), 1869);

        System.out.println(book);
    }
}
