package com.jdbc.StudentDatabase;

import java.sql.*;
import java.util.Scanner;

public class StudentImpl implements IStudent {

    private Scanner sc = new Scanner(System.in);
    private IConnection connectionService = new ConnectionImpl();

    @Override
    public void insertStudent() {
        try (Connection con = connectionService.getConnection()) {
            System.out.print("Enter student id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            System.out.print("Enter student grade: ");
            String grade = sc.next();

            String query = "INSERT INTO student (id, name, age, grade) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, grade);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Student inserted successfully!" : "❌ Insert failed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertMultipleStudents() {
        try (Connection con = connectionService.getConnection()) {
            System.out.print("Enter number of students to insert: ");
            int n = sc.nextInt();
            sc.nextLine();

            String query = "INSERT INTO student (id, name, age, grade) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            for (int i = 1; i <= n; i++) {
                System.out.println("\n--- Student " + i + " ---");
                System.out.print("Enter student id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter student age: ");
                int age = sc.nextInt();

                System.out.print("Enter student grade: ");
                String grade = sc.next();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, age);
                ps.setString(4, grade);
                ps.addBatch();
            }

            int[] rows = ps.executeBatch();
            System.out.println("✅ " + rows.length + " students inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateStudent() {
        try (Connection con = connectionService.getConnection()) {
            System.out.print("Enter student id to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            System.out.print("Enter new age: ");
            int age = sc.nextInt();

            System.out.print("Enter new grade: ");
            String grade = sc.next();

            String query = "UPDATE student SET name=?, age=?, grade=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, grade);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Student updated successfully!" : "❌ Student not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateMultipleStudents() {
        try (Connection con = connectionService.getConnection()) {
            System.out.print("Enter number of students to update: ");
            int n = sc.nextInt();
            sc.nextLine();

            String query = "UPDATE student SET name=?, age=?, grade=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            for (int i = 1; i <= n; i++) {
                System.out.println("\n--- Update Student " + i + " ---");
                System.out.print("Enter student id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new name: ");
                String name = sc.nextLine();

                System.out.print("Enter new age: ");
                int age = sc.nextInt();

                System.out.print("Enter new grade: ");
                String grade = sc.next();

                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setString(3, grade);
                ps.setInt(4, id);
                ps.addBatch();
            }

            int[] rows = ps.executeBatch();
            System.out.println("✅ " + rows.length + " students updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent() {
        try (Connection con = connectionService.getConnection()) {
            System.out.print("Enter student id to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM student WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Student deleted successfully!" : "❌ Student not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMultipleStudents() {
        try (Connection con = connectionService.getConnection()) {
            System.out.print("Enter number of students to delete: ");
            int n = sc.nextInt();

            String query = "DELETE FROM student WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter student id " + i + ": ");
                int id = sc.nextInt();
                ps.setInt(1, id);
                ps.addBatch();
            }

            int[] rows = ps.executeBatch();
            System.out.println("✅ " + rows.length + " students deleted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showStudents() {
        try (Connection con = connectionService.getConnection()) {
            String query = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\n===== Student Records =====");
            System.out.printf("%-5s %-20s %-5s %-10s%n", "ID", "Name", "Age", "Grade");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-5d %-20s %-5d %-10s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("grade"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
