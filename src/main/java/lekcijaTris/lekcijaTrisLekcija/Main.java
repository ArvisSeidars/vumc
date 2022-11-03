package lekcijaTris.lekcijaTrisLekcija;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sākās programma");
        manaMetode();
        printNewLine();

        manaMetode2("Pēteris", "Skuja", "Rīga", 23);
        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(54, 10);
        System.out.println("Taisnstūra laukums ir " + laukums);
        whileCikls();
        produktuSaraksts2();

            }

    String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};

    public static void printNewLine() {
        System.out.println("\n");
    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void manaMetode() {
        System.out.println("@@@@@@@@@@@");
        System.out.println("Arvis Seidars");
        System.out.println("Ludza");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
    }

    public static void manaMetode2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@@");
        System.out.println(vards + uzvards);
        System.out.println(pilseta);
        System.out.println(vecums);

        int[] menesaTerini = {50, 100, 70, 30, 250, 325};
        String[] produktuSaraksts = {"piens", "olas", "sviests", "maize" };
        System.out.println(produktuSaraksts[0]);
        int[] menesaGada = new int[12];
        menesaGada[0] = 1;

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes" };
        System.out.println("Masiva garums ir:" + cars.length);

        cars[1] = "Audi";
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);
    }
    public static void whileCikls() {
        int x = 5;
        while (x >= 0) {
            System.out.println("X nav nulle, X = " + x);
            x = x - 1;
        }
    }
    public static void produktuSaraksts2(){
        int[] menesaTerini = {50, 100, 70, 30, 250, 325};
        int k = 0;
        while(k < 5){
            System.out.println(menesaTerini[k]);
            k++;

        }
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
        while (number > 0) {
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("summa ir:" + summa);

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int m = 0;
        while(m < kartis.length){
            System.out.println(kartis[m]);
            m++;
        }
    }



    }
