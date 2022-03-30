package com.zadania;

public class PhoneBook {
    public static void main(String[] args)
    {

        int id = 13;
        String name = "Bono";
        String surname = "Bo";
        int phoneNumber = 333999666;
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        printContactCard(id, name, surname, age, phoneNumber);
        printContact(id, name, surname, phoneNumber, age);
        System.out.println(getContact(id, name, surname, phoneNumber, age));
    }

    public static void printContactCard(int id, String name, String surname, int age, int phoneNumber)
    {
        System.out.println("Id: " + id + "\nName: " + name + "\nSurname: " + surname + "\nage: " + age + "\nnumber: " + phoneNumber);
    }

    public static void printContact (int id, String name, String surname, int phoneNumber, int age)
    {
        System.out.println(id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
    }

    public static String getContact(int id, String name, String surname, int age, int phoneNumber)
    {
        return (id + " | " + name + " | " + surname + " | " + age + " | " + phoneNumber);
    }
}




