package com.monprojet.services;

import com.monprojet.database.DatabaseManager;
import com.monprojet.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public static void addUser(String name, String email){
        String query = "INSERT INTO users (name, email) VALUES (?, ?)";
        try(Connection conn = DatabaseManager.connect();
            Statement stmt = conn.createStatement(query)){
            stmt.setString(1,name);
            stme.SetString(2,email);
            stmt.executeUpdate();
            System.out.println("User added");
            }
        catch (SQLException e) {
            System.out.println("❌ Error fetching users: " + e.getMessage());
        }
    }

    public static List<User> listUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";
        try (Connection conn = DatabaseManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email")));
            }

        } catch (SQLException e) {
            System.out.println("❌ Error fetching users: " + e.getMessage());
        }
        return users;
    }

    public static void deleteUser(int id) {
        String query = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DatabaseManager.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ User deleted successfully!");
            } else {
                System.out.println("⚠ No user found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error deleting user: " + e.getMessage());
        }
    }

    public static void editUser(int id, String newName, String newEmail) {
        String query = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = DatabaseManager.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newName);
            stmt.setString(2, newEmail);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ User updated successfully!");
            } else {
                System.out.println("⚠ No user found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error updating user: " + e.getMessage());
        }
    }

    public static User searchUserByEmail(String email) {
        String query = "SELECT * FROM users WHERE email = ?";
        try (Connection conn = DatabaseManager.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("❌ Error searching user: " + e.getMessage());
        }
        return null;
    }
}
