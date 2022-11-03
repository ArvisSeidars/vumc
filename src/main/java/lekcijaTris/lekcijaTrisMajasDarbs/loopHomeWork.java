package lekcijaTris.lekcijaTrisMajasDarbs;

import java.util.Scanner;

public class loopHomeWork {
    public static void main(String[] args) {
//1.uzdevums
        int x = 1;
        while (x < 101) {
            System.out.println("X = " + x);
            x = x + 1;

        }
        System.out.println("Gatavs");

//2.uzdevums
        String[] suns = {"Taksis", "Labradors", "Mopsis", "Dobermanis", "Pitbuls"};
        int[] autoCena = {1033, 150, 2000, 5320, 2511, 302, 35200, 6200, 63200};
        char[] keburi = {'+', '#', '-', '}', '*', '&'};

        int p = 0;
        while (p < suns.length) {
            System.out.println(suns[p]);
            p++;
        }
        int o = 0;
        while (o < autoCena.length) {
            System.out.println("Automašīnu cenas ir :" + autoCena[o]);
            o++;
        }
        int i = 0;
        while (i < keburi.length) {
            System.out.println("Dažādi simboli : " + keburi[i]);
            i++;
        }
        int l = 0;
        do {
            String suga = suns[l];
            System.out.println(suga);
            l++;
        }
        while (l < suns.length);

        int k = 0;
        do {
            int cena = autoCena[k];
            System.out.println(cena);
            k++;
        }
        while (k < autoCena.length);

        int j = 0;
        do {
            char simboli = keburi[j];
            System.out.println(simboli);
            j++;
        }
        while (j < keburi.length);

        for (int z = 0; z < suns.length; z = z + 2) {
            System.out.println(suns[z]);
        }
        for (int s = 0; s < autoCena.length; s++) {
            System.out.println(autoCena[s]);
        }
        for (int d = 0; d < keburi.length; d = d + 3) {
            System.out.println(keburi[d]);
        }

        for (String suga : suns) {
            System.out.println(suga);
        }
        for (int cena : autoCena) {
            System.out.println(cena);
        }
        for (char simboli : keburi) {
            System.out.println(simboli);
        }


//3.uzdevums
        int[] skaitluMasivs = new int[100];
        for (int q = 0; q < skaitluMasivs.length; q++) {
            skaitluMasivs[q] = q * 2;
        }
        for (int vertiba : skaitluMasivs) {
            System.out.print(vertiba);
        }


//4.uzdevums (neskaidrs)
                }

    }












