import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to Todo App!");
        do {
            System.out.println("Enter command (add/list/exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter a new todo: ");
                    String todo = scanner.nextLine();
                    todos.add(todo);
                    break;
                case "list":
                    System.out.println("Your Todos:");
                    for (String t : todos) {
                        System.out.println("- " + t);
                    }
                    break;
                case "exit":
                    System.out.println("Exiting Todo App.");
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
