package com.zadania;

public class PhoneBook2 {
    public static void main(String[] args)
    {

        int id = 13;
        String name = "Bono";
        String surname = "";
        String phoneNumber = "3339996";
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        printContactCard(id, name, surname, age, phoneNumber);
        printContact(id, name, surname, phoneNumber, age);
        System.out.println(getContact(id, name, surname, age, phoneNumber));
        System.out.println(getContactRaw(id, name, surname, age, phoneNumber, isHidden));
    }

    public static void printContactCard(int id, String name, String surname, int age, String phoneNumber)
    {

        if (name == "")
        {
            name = "Unknown";
        }
        if (surname == "")
        {
            surname = "Unknown";
        }
        if (phoneNumber.length() != 9)
        {
            phoneNumber = "000000000";
        }

        System.out.println("Id: " + id + "\nName: " + name + "\nSurname: " + surname + "\nage: " + age + "\nnumber: " + phoneNumber);
    }

    public static void printContact (int id, String name, String surname, String phoneNumber, int age)
    {

        if (name == "")
        {
            name = "Unknown";
        }
        if (surname == "")
        {
            surname = "Unknown";
        }
        if (phoneNumber.length() != 9)
        {
            phoneNumber = "000000000";
        }
        System.out.println(id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
    }

    public static String getContact(int id, String name, String surname, int age, String phoneNumber)
    {
        if (name == "")
        {
            name = "Unknown";
        }
        if (surname == "")
        {
            surname = "Unknown";
        }
        if (phoneNumber.length() != 9)
        {
            phoneNumber = "000000000";
        }
        return (id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
    }

    public static String getContactRaw(int id, String name, String surname, int age, String phoneNumber, boolean isMobile)
    {
        if (name == "")
        {
            name = "Unknown";
        }
        if (surname == "")
        {
            surname = "Unknown";
        }
        if (phoneNumber.length() != 9)
        {
            phoneNumber = "000000000";
        }

        return (id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber + " | " + isMobile );
    }
}


