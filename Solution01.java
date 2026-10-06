import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Construtor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Imprime os dados da pessoa
    public void printPerson() {
        System.out.println(
            "Name: " + lastName + ", " + firstName
            + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    /*
    *   Construtor da classe
    *
    *   @param firstName - String com o primeiro nome da pessoa.
    *   @param lastName - String com o sobrenome da pessoa.
    *   @param id - Inteiro com o número de identificação da pessoa.
    *   @param scores - Array de inteiros com as notas da pessoa.
    */
    // Escreva o construtor aqui

    /*
    *   Nome do método: calculate
    *   @return Um caractere com o conceito.
    */
    // Escreva o método aqui
}

public class Solution01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
