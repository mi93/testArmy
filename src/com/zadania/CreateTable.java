package com.zadania;

public class CreateTable {
    public static void main(String[] args)
    {
        int tab[] = new int[10];
        System.out.println("Value of index 0: " + getLastDialed(tab));
        System.out.println("Value of index provided by the user: " + getIndex(tab, 4));
        dial(tab, 2);
        System.out.println("Value of the first index check: " + tab[0]);
        removeLastDialed(tab, 5);
        System.out.println("Value of the 5th index check: " + tab[5]);
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
        return tab[0] = id;
    }

    public static int removeLastDialed(int[] tab, int index)
    {
        return tab[index - 1] = 0;
    }

}
