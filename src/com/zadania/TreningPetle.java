package com.zadania;

public class TreningPetle {
    public static void main(String[] args) {
        //exampleSwitch();
        System.out.println(obliczSilnię2(6) + " ...oto wynik z metody");
        int silnia6 = 1 * 2 * 3 * 4 * 5 * 6;
        System.out.println("silnia 6: " + silnia6);


    }

  /*  public static int obliczSilnię(int liczba)
    {
        int silnia = 1;
        int n = 2;*/
//        // 1*1,
//        // int silnia = 1;
//        // int n = 2;
//        // 1*2 = 2
//        // silnia = 2;
//        // n = 3:
//        // 2*3 = 6;
//        // silnia = 6;
//        // n = 4;
//        // 6*4 = 24;
//        // silnia = 24;
//        // n = 5;
//        // 24*5 = 120;
//        // silnia = 120;
//        // n = 6
//        // 120*6
//        // silnia = 720
//        // n - 7
//
//        if (liczba > 1)
//        {
//            while (n <= liczba)
//            {
//                silnia = silnia * n;
//                n++;
//            }
//
//        }
//        return silnia;
//    }
//
//}
//

//    public static void exampleSwitch() {
//        int liczba = 0;
//
//        switch (liczba) {
//
//            case 0:
//                System.out.println("Liczba jest równa: " + liczba);
//            case 1:
//                System.out.println("Liczba jest równa tak: " + liczba);
//            case 2:
//                System.out.println("Liczba jest równa nie: " + liczba);
//            default:
//                System.out.println("Liczba jest poza zakresem");
//                break;
//        }
//    }

        public static int obliczSilnię2(int liczba)
        {
            int silnia = 1;

            if (liczba > 1)
            {
                for (int n = 2; n <= liczba; n++ ){
                    silnia *= n;
                }
            }
        return silnia;
        }

 }