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
            System.out.println("3.Edit");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
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
                    System.out.println("Enter the contact person name to edit:");
                    String name = scanner.next();
                    boolean isEdited = addressBook.edit(name);
                    if (isEdited) {
                        System.out.println("The given person name is not existing in the array list.");
                    }
                    else {
                        System.out.println("The person is edited.");
                    }
                }break;
                case 4 : {
                    System.out.println("Enter the contact person name to delete:");
                    String name = scanner.next();
                    boolean isDeleted = addressBook.delete(name);
                    if (isDeleted == false) {
                        System.out.println("The given person name is not existing in the array list.");
                    }
                    else {
                        System.out.println("The person is deleted.");
                    }
                }break;
                case 5 : {
                    System.out.println("Thank you! See you soon!");
                    System.exit(0);
                }break;
                default: {
                    System.out.println("Choice is wrong! Please try again!");
                }
            }
        }
        while (choice != 5);
    }
}
