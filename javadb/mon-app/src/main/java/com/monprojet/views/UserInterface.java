package com.monprojet.views;

import com.monprojet.services.UserService;
import com.monprojet.models.User;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📌 Menu:");
            System.out.println("1. Add User");
            System.out.println("2. List Users");
            System.out.println("3. Delete User");
            System.out.println("4. Edit User");
            System.out.println("5. Search User by Email");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("❌ Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    UserService.addUser(name, email);
                }
                case 2 -> {
                    List<User> users = UserService.listUsers();
                    users.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Enter user ID to delete: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    UserService.deleteUser(id);
                }
                case 4 -> {
                    System.out.print("Enter user ID to edit: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    UserService.editUser(id, newName, newEmail);
                }
                case 5 -> {
                    System.out.print("Enter email to search: ");
                    String email = scanner.nextLine();
                    User user = UserService.searchUserByEmail(email);
                    System.out.println(user != null ? user : "⚠ User not found!");
                }
                case 6 -> System.out.println("🚪 Exiting...");
                default -> System.out.println("❌ Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
