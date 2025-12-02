package dao;

import java.sql.*;
import model.Admin;

public class AdminDao {
    final String url = "jdbc:mysql://localhost:3306/bankingapplication";
    final String host = "root";
    final String password = "adeshabin1251";

    public void registerCustomer(Admin admin) throws Exception {
        Connection con = DriverManager.getConnection(url, host, password);
        String query = "insert into admin values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, admin.getAccountNo());
        ps.setString(2, admin.getName());
        ps.setString(3, admin.getAddress());
        ps.setString(4, admin.getMobileNo());
        ps.setString(5, admin.getEmail());
        ps.setString(6, admin.getAccType());
        ps.setInt(7, admin.getInitialBalance());
        ps.setString(8, admin.getDob());
        ps.setString(9, admin.getIdProof());
        int check = ps.executeUpdate();
        ps.close();
        String query1 = "insert into customer values (?, ?, ?)";
        PreparedStatement ps1 = con.prepareStatement(query1);
        ps1.setString(1, admin.getAccountNo());
        ps1.setString(2, admin.getPassword());
        ps1.setInt(3, admin.getInitialBalance());
        int check1 = ps1.executeUpdate();
        if (check > 0 && check1 > 0)
            System.out.println("New Customer Registered Successfully...");
        else
            System.out.println("Registration failed..");
        ps1.close();
        con.close();
    }
}