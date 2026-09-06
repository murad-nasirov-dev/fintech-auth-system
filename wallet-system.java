import java.util.Scanner;

public class Main {

    public static class Wallet {
        private double balance;

        public Wallet(double initialBalance) {
            this.balance = Math.max(0, initialBalance);
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wallet wallet = new Wallet(0.0);
        int choice = 0;

        do {
            System.out.println("\n--- Smart Wallet ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + wallet.getBalance() + " AZN");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = scanner.nextDouble();
                    if (dep > 0) {
                        wallet.deposit(dep);
                        System.out.println(dep + " AZN successfully deposited.");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = scanner.nextDouble();
                    if (wallet.withdraw(wit)) {
                        System.out.println(wit + " AZN withdrawn from balance.");
                    } else {
                        System.out.println("Insufficient funds or invalid amount!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

