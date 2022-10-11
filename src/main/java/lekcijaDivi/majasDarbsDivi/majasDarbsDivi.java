package lekcijaDivi.majasDarbsDivi;

import java.util.Scanner;

public class majasDarbsDivi {
    public static void main(String[] args) {

 //1.uzdevums
        int x = 6;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);

        int a = 4;

        System.out.println(a < 5 || a != 5 && a < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);

//2.uzdevums
        int IevadiMēnesi = 11;

        switch (IevadiMēnesi) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novemnris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
        }
//3.uzdevums
        int i = 20;
        int n = 45;
        int o = 5;

        if (i > n && i>o) {
            System.out.println("Skaitlis ir : " + i);
        } else if (o > i && o >n) {
            System.out.println("Skaitlis ir : " + o);
        } else if (n > i && n>o) {
            System.out.println("Skaitlis ir : " + n);
        }

//4.uzdevums
        String luksafors;
        System.out.println("Iedegas luksafora krāsa :");
        Scanner scanner = new Scanner(System.in);
        luksafors = scanner.nextLine();

        if (luksafors.equals("sarkans")) {
            System.out.println("Stāvi!");
        } else if (luksafors.equals("dzeltens")) {
            System.out.println("Gatavību!");
        } else if (luksafors.equals("zaļš")) {
            System.out.println("Aiziet!Aiziet!");
        } else {
            System.out.println("Luksafors nedarbojas. Ievērojiet auto kustību un droši šķērsojiet braukutves daļu!");
        }

vizitkarte();
vizitkarte();
vizitkarteDivi("Jānis", "Zariņš", Long.parseLong("26565650"),1995);
vizitkarteDivi("Edgars", "Habibuļins", Long.parseLong("36555450"), 1974);
        }
//5.uzdevums

    public static void vizitkarte(){
        System.out.println("VIZĪTKARTE");
        System.out.println("#%#%#%#%#%#%#%#%#");
        System.out.println("Vārds : Arvis ");
        System.out.println("Uzvārds : Seidars ");
        System.out.println ("Telefona numurs : +371 230303030");
        System.out.println("Dzimšanas gads : 1985");
        System.out.println("#%#%#%#%#%#%#%#%#");
}
public static void vizitkarteDivi(String vārds, String uzvārds, long telefonaNumurs, int dzimsanasGads ){
    System.out.println("@@@@@@@@@@@");
    System.out.println("Vārds : " + vārds);
    System.out.println("Uzvārds : " + uzvārds);
    System.out.println("Telefona Numurs : " + "+371" + telefonaNumurs);
    System.out.println("Dzimsanas Gads : " + dzimsanasGads);
    System.out.println("#$%#$%#$%#%%$#%$%#%$");
}



    }









