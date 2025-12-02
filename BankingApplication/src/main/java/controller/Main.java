package controller;

import model.Admin;
import java.util.*;

import dao.AdminDao;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Admin admin = new Admin();
        AdminDao ad = new AdminDao();

        do {
            System.out.println("Enter the choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the account no: ");
                    admin.setAccountNo(sc.nextLine());
                    System.out.println("Enter the Customer name: ");
                    admin.setName(sc.nextLine());
                    System.out.println("Enter the Address: ");
                    admin.setAddress(sc.nextLine());
                    System.out.println("Enter the Mobile no: ");
                    admin.setMobileNo(sc.nextLine());
                    System.out.println("Enter the Email: ");
                    admin.setEmail(sc.nextLine());
                    System.out.println("Enter the Account type: ");
                    admin.setAccType(sc.nextLine());
                    System.out.println("Enter the Initial Balance: ");
                    admin.setInitialBalance(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter the DOB: ");
                    admin.setDob(sc.nextLine());
                    System.out.println("Enter the ID proof: ");
                    admin.setIdProof(sc.nextLine());
                    System.out.println("Enter the password for the customer account: ");
                    admin.setPassword(sc.nextLine());
                    ad.registerCustomer(admin);
                    break;

                case 2:

                    break;
                default:
                    break;
            }
        } while (choice < 5);
    }
}