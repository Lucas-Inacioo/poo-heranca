import java.util.*;

// Escreva a classe Book aqui
    // Declare os atributos title, author e price como private
    // Escreva o construtor que recebe title, author e price
    // Escreva os métodos getTitle(), getAuthor() e getPrice()

// Escreva a classe PrintedBook aqui, herdando de Book
    // Declare o atributo pages como private
    // Escreva o construtor que recebe title, author, price e pages
    // Escreva o método getPages()

// Escreva a classe Ebook aqui, herdando de Book
    // Declare o atributo watermark como private
    // Escreva o construtor que recebe title, author e price
    // Escreva os métodos setWatermark(String watermark) e getWatermark()

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine().trim();
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int price = Integer.parseInt(scanner.nextLine().trim());

            if (type.equals("PRINTED")) {
                int pages = Integer.parseInt(scanner.nextLine().trim());
                PrintedBook book = new PrintedBook(title, author, price, pages);
                System.out.println("Type: Printed");
                printBook(book);
                System.out.println("Pages: " + book.getPages());
            } else {
                String watermark = scanner.nextLine();
                Ebook book = new Ebook(title, author, price);
                book.setWatermark(watermark);
                System.out.println("Type: Ebook");
                printBook(book);
                System.out.println("Watermark: " + book.getWatermark());
            }
        }
        scanner.close();
    }

    // Recebe qualquer livro, seja impresso ou digital
    static void printBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}
