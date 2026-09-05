import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double USD_RATE = 1.70;
        final double EUR_RATE = 1.85;

        System.out.print("Enter the amount you want to convert (AZN): ");

        if (scanner.hasNextDouble()) {
            double azn = scanner.nextDouble();

            double usd = azn / USD_RATE;
            double eur = azn / EUR_RATE;

            System.out.println("\n+++ Results +++");
            System.out.printf("USD: %.2f $\n", usd);
            System.out.printf("EUR: %.2f EUR\n", eur);
        } else {
            System.out.println("Error: Please enter a valid numeric value!");
        }

        scanner.close();
    }
}
