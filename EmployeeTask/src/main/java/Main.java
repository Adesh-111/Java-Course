package main.java;

import java.sql.*;
import java.util.*;

class Student {
    int id;
    String name;
    String password;
    int marks;
    final String url = "jdbc:mysql://localhost:3306/student";
    final String user = "root";
    final String pass = "adeshabin1251";

    public void registerStudent() throws Exception {
        Connection con = DriverManager.getConnection(url, user, pass);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your id: ");
        id = sc.nextInt();
        System.out.println("Enter your marks: ");
        marks = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the password");
        password = sc.nextLine();

        String sqlQuery = "insert into student values(?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.setString(3, password);
        ps.setInt(4, marks);
        boolean check = ps.execute();
        if (!check)
            System.out.println("Registered successfully");
        else
            System.out.println("Not Registered");
        System.out.println("Registration complete");
        con.close();
    }

    public void updatePassword() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id for update: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your new password: ");
        password = sc.nextLine();
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlQuery = "update student set password = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setString(1, password);
        ps.setInt(2, id);
        boolean check = ps.execute();
        if (!check)
            System.out.println("Updated successfully");
        else
            System.out.println("Not updated");
        con.close();
    }

    public void deleteStudent() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id for delete: ");
        id = sc.nextInt();
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlQuery = "delete from student where id = ?";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setInt(1, id);
        boolean check = ps.execute();
        if (!check)
            System.out.println("Deleted successfully");
        else
            System.out.println("Failed to delete");
        con.close();
    }

    public void selectStudent() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        id = sc.nextInt();
        Connection con = DriverManager.getConnection(url, user, pass);
        String sqlQuery = "select * from student where id = ?";
        PreparedStatement ps = con.prepareStatement(sqlQuery);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next())
            System.out.println(rs.getString(1) + " - " + rs.getInt(2));
        else
            System.out.println("The selected student id not found");
        con.close();
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice = 0;
        do {
            System.out.println("______________________________________________________________________");
            System.out.println(
                    "Select an operation \n 1- Registration \n 2- Password Update \n 3- Delete a Record \n 4- Search for a Student \n 5- Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s.registerStudent();
                    break;
                case 2:
                    s.updatePassword();
                    break;
                case 3:
                    s.deleteStudent();
                    break;
                case 4:
                    s.selectStudent();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a valid operation...");
                    break;
            }
        } while (choice < 4);
        System.out.println("Thank you for time...");
        sc.close();
    }
}