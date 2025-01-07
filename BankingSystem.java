import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> accounts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to Simple Banking System!");
        do {
            System.out.println("Enter command (create/deposit/withdraw/show/exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "create":
                    System.out.println("Enter account name: ");
                    String name = scanner.nextLine();
                    accounts.put(name, 0);
                    System.out.println("Account created for " + name);
                    break;
                case "deposit":
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter deposit amount: ");
                    int deposit = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    accounts.put(name, accounts.get(name) + deposit);
                    System.out.println("Deposited " + deposit + " to " + name);
                    break;
                case "withdraw":
                    System.out.println("Enter account name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter withdrawal amount: ");
                    int withdrawal = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    if (accounts.get(name) >= withdrawal) {
                        accounts.put(name, accounts.get(name) - withdrawal);
                        System.out.println("Withdrew " + withdrawal + " from " + name);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case "show":
                    System.out.println("Account balances:");
                    accounts.forEach((k, v) -> System.out.println(k + ": " + v));
                    break;
                case "exit":
                    System.out.println("Exiting Banking System.");
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
