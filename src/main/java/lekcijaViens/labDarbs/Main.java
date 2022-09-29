package lekcijaViens.labDarbs;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        //int - integer , satur veselu skaitli
        //mainigos raksta ar mazo burtu
        //Maksimālā integer vērtība
        // string ir teksts vai vārds

        int maxInt = 2147483647;
        //Min integer vērtība
        int minInt = -2147483648;


        int vecums = 34;
        System.out.println("Mans vecums ir:" + vecums);
        int augums = 182;
        System.out.println("Mans augums ir:");
        System.out.println(augums);
        int svars = 100;
        System.out.println("Mans svars ir:");
        System.out.println(svars);
        int kurpjuIzmers = 45;
        System.out.println("Mans kurpju Izmers ir:" + kurpjuIzmers );

        String sunaVards = "Lora";
        String teksts = "Suņa vārds ir: ";
        System.out.println(teksts + sunaVards);

        byte sunaVecums = 7;
        String teksts1 = "Suņa vecums ir: ";
        System.out.println(teksts1 + sunaVecums);
        //byte pieņem veselu skaitli no -127 līdz +127

        double grauduSvars = 150.23;
        System.out.println( "Nopirkti : " + grauduSvars );

        // boolean nosaka ir patiess vai nepatiess
        boolean isOpen = true;
        //Šodien ir sestdiena, lielveikals ir atvērts
        boolean isSuperMarketOpen = true;
        //Turpretīm skolas ir slēgtas
        boolean isSchoolOpen = false;

        System.out.println("Vai veikals ir atvērts?" + isSuperMarketOpen);

        boolean vaiSunsIrPotets = true;

        char valuta = '$';
        char dzimums = 'v';
        char dzimums2 = 's';

        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;


        System.out.println(summa);

        summa = a + a;

        System.out.println(summa);

        String name = "Juris";
        System.out.println(name);
        name = "Jānis";
        System.out.println(name);

        int x = 10;
        int y = -45;
        int rezultats = x+y;
        System.out.println(rezultats);

        rezultats = 10/2;
        System.out.println(rezultats);

        rezultats = y-x;
        System.out.println(rezultats);

        rezultats = 11%2;
        System.out.println(rezultats);

        int x = 5;
        int y = -45;

        int rezultats = x + y;
        System.out.println(rezultats);

        rezultats = x - y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = 10 / 2;
        System.out.println(rezultats);
        rezultats = 13 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/2;
        System.out.println(rezultats);

        rezultats = 5*(3+7)/4;
        System.out.println(rezultats);
















    }
}
