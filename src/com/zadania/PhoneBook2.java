package com.zadania;

public class PhoneBook2 {
    public static void main(String[] args)
    {

        int id = 13;
        String name = "Bono";
        String surname = "";
        int phoneNumber = 333999666;
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        printContactCard(id, name, surname, age, phoneNumber);
        printContact(id, name, surname, phoneNumber, age);
        System.out.println(getContact(id, name, surname, phoneNumber, age));
        System.out.println(getContactRaw(id, name, surname, age, phoneNumber, isHidden));
    }

    public static void printContactCard(int id, String name, String surname, int age, int phoneNumber)
    {

        if (name == "") {
            name = "Unknown";
        }
        else if (surname == "") {
            surname = "Unknown";
        }
        System.out.println("Id: " + id + "\nName: " + name + "\nSurname: " + surname + "\nage: " + age + "\nnumber: " + phoneNumber);
    }

    public static void printContact (int id, String name, String surname, int phoneNumber, int age)
    {

        if (name == "") {
            name = "Unknown";
        }
        else if (surname == "") {
            surname = "Unknown";
        }
        System.out.println(id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
    }

    public static String getContact(int id, String name, String surname, int age, int phoneNumber)
    {
        if (name == "") {
            name = "Unknown";
        }
        else if (surname == "") {
            surname = "Unknown";
        }
        return (id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
    }

    public static String getContactRaw(int id, String name, String surname, int age, int phoneNumber, boolean isMobile)
    {
        if (name == "") {
            name = "Unknown";
        }
        else if (surname == "") {
            surname = "Unknown";
        }
        return (id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber + " | " + isMobile );
    }
}



