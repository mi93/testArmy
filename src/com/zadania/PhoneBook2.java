package com.zadania;

import java.util.Arrays;

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

        int tab[] = new int[10];
        System.out.println("Value of index 0: " + getLastDialed(tab));
        System.out.println("Value of index provided by the user: " + getIndex(tab, 4));
        System.out.println("Value of the first index check: " + tab[0]);
        removeLastDialed(tab, 5);
        System.out.println("Value of the 5th index check: " + tab[5]);

        NumberType numberType = NumberType.MOBI;
        System.out.println("\n################");
        System.out.println();
        System.out.println("funkcja dial: " + dial(tab, 5));
        System.out.println("funkcja dial: " + dial(tab, 6));
        System.out.println("funkcja dial: " + dial(tab, 4));
        System.out.println("funkcja dial: " + dial(tab, 2));
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

        return (id + ";" + name + ";" + surname + ";" + age + ";" + phoneNumber + ";" + isMobile );
    }

    public static int getLastDialed(int[] tab)
    {
        return tab[0];
    }

    public static int getIndex(int[] tab, int index)
    {
        if (tab[index - 1] == 0)
        {
            System.out.println("Given index contains incorrect id");
        }
        return tab[index - 1];
    }

    public static int dial(int[] tab, int id)
    {
        for (int i = 8; i >= 0; i-- ) {
            tab[i + 1] = tab[i];
            tab[0] = id;
        }
        System.out.println(Arrays.toString(tab));
    return tab[0] = id;
    }

    public static int removeLastDialed(int[] tab, int index)
    {
        return tab[index - 1] = 0;
    }

    enum NumberType
    {
        HOME ("Domowy"),
        MOBI ("Komórkowy"),
        WORK ("Służbowy");

        String type;

        NumberType (String NumType)
        {
            type = NumType;
        }
    }
}
