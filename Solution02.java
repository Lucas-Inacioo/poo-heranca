import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare a classe MyBook aqui. Não use o modificador de acesso 'public'.
    // Declare o atributo price

    /**
    *   Construtor da classe
    *
    *   @param title O título do livro.
    *   @param author O autor do livro.
    *   @param price O preço do livro.
    **/
    // Escreva o construtor aqui

    /**
    *   Nome do método: display
    *
    *   Imprime o título, o autor e o preço no formato especificado.
    **/
    // Escreva o método aqui

// Fim da classe

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
