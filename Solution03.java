import java.util.*;

class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "employee", getFirstName(), getLastName(),
            "social security number", getSocialSecurityNumber());
    }
}

// Escreva a classe HourlyEmployee aqui, herdando de Employee
    // Declare os atributos wage e hours como private
    // Escreva o construtor que recebe firstName, lastName, socialSecurityNumber, wage e hours
    // Escreva os métodos setWage, getWage, setHours e getHours
    // Escreva o método earnings
    // Sobrescreva o método toString

public class Solution03 {
    public static void main(String[] args) {
        // Garante o ponto como separador decimal, qualquer que seja o idioma do computador
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        for (int i = 0; i < n; i++) {
            String firstName = scanner.next();
            String lastName = scanner.next();
            String socialSecurityNumber = scanner.next();
            double wage = Double.parseDouble(scanner.next());
            double hours = Double.parseDouble(scanner.next());

            try {
                HourlyEmployee employee = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours);
                System.out.println(employee);
                System.out.printf("earnings: %.2f%n", employee.earnings());
            } catch (IllegalArgumentException e) {
                System.out.println("invalid employee: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
