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

        String adminUser = "admin@bank.in";
        String adminPassword = "admin@123";

        System.out.println("Which type of user you are? \n 1. Admin \n 2. Customer \n 3. Exit ");
        int userChoice = sc.nextInt();
        sc.nextLine();

        switch (userChoice) {
            case 1:
                System.out.println("Enter the admin user name: ");
                String aUser = sc.nextLine();
                System.out.println("Enter the password: ");
                String aPass = sc.nextLine();
                if (adminUser.equals(aUser) && adminPassword.equals(aPass)) {
                    System.out.println("Welcome to Admin panel");
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
                                ad.updateCustomer(admin);
                                break;
                            default:
                                break;
                        }
                    } while (choice < 5);
                    break;
                }
            case 3:
                System.out.println("Exiting Banking application..");
            default:
                break;
        }

    }
}