package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();
    public void getData() {
        Contact contactPerson = new Contact();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Person First Name : ");
        String firstName = scanner.next();
        contactPerson.setFirstName(firstName);
        System.out.println("Enter Person Last Name : ");
        String lastName = scanner.next();
        contactPerson.setLastName(lastName);
        System.out.println("Enter Person City : ");
        String city = scanner.next();
        contactPerson.setCity(city);
        System.out.println("Enter Person State : ");
        String state = scanner.next();
        contactPerson.setState(state);
        System.out.println("Enter Person Zipcode : ");
        int zipcode = scanner.nextInt();
        contactPerson.setZip(zipcode);
        System.out.println("Enter person Phone Number : ");
        long phoneNumber = scanner.nextLong();
        contactPerson.setPhoneNumber(phoneNumber);
        System.out.println("Enter person Email ID : ");
        String email = scanner.next();
        contactPerson.setEmail(email);
        contacts.add(contactPerson);
    }

    public void edit(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Scanner scanner = new Scanner(System.in);
            if (contacts.get(i).getFirstName().equals(name)) {
                System.out.println("Enter Person First Name : ");
                String firstName = scanner.next();
                contacts.get(i).setFirstName(firstName);
                System.out.println("Enter Person Last Name : ");
                String lastName = scanner.next();
                contacts.get(i).setLastName(lastName);
                System.out.println("Enter Person City : ");
                String city = scanner.next();
                contacts.get(i).setCity(city);
                System.out.println("Enter Person State : ");
                String state = scanner.next();
                contacts.get(i).setState(state);
                System.out.println("Enter Person Zipcode : ");
                int zipcode = scanner.nextInt();
                contacts.get(i).setZip(zipcode);
                System.out.println("Enter person Phone Number : ");
                long phoneNumber = scanner.nextLong();
                contacts.get(i).setPhoneNumber(phoneNumber);
                System.out.println("Enter person Email ID : ");
                String email = scanner.next();
                contacts.get(i).setEmail(email);
            }
        }
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                '}';
    }
}
