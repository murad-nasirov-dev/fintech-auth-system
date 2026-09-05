import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner general = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = general.nextLine();

        System.out.print("Enter password: ");
        String password = general.nextLine();

        if (username.equals("murad") && password.equals("1234")) {
            System.out.println("Login successful! Verifying identity...");

            System.out.print("Enter birth year: ");
            int birthYear = general.nextInt();
            int age = 2026 - birthYear;

            if (age >= 18) {
                System.out.println("Hello " + username + ", you are " + age + " years old.");
                System.out.println("Access granted to the Fintech system!");
            } else {
                System.out.println("Error: Access blocked! You must be at least 18 years old.");
            }

        } else {
            System.out.println("Error: Invalid username or password!");
        }

        general.close();
    }
}