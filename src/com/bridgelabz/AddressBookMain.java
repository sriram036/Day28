package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add Contact");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 : {
                    addressBook.getData();
                }break;
                case 2 : {
                    System.out.println(addressBook);
                }break;
                case 3 : {
                    System.out.println("Thank you! See you soon!");
                    System.exit(0);
                }break;
                default: {
                    System.out.println("Choice is wrong! Please try again!");
                }
            }
        }
        while (choice != 3);
    }
}
