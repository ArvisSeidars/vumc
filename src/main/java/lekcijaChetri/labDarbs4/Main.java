package lekcijaChetri.labDarbs4;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String vards = " Arvis ";
        House majaViens = new House(10, 20, 5, "Mozo iela 5", 2.44, 15000, true );
        majaViens.adrese="Miera iela 123 ";
        majaViens.durvjuSkaits= 20;
        majaViens.griestuAugstums=2.4;
        majaViens.kadastralaVertiba=15000;
        majaViens.loguSkaits=50;
        majaViens.stavuDaudzums=5;
        majaViens.vaiPrivatipasums=true;
        majaViens.printHouse();


        House majaDivi = new House(12, 12,25,"SSSSlllkjj iela 5", 25522,25542, true
        );
        majaDivi.adrese="Staru iela 123 ";
        majaDivi.durvjuSkaits= 50;
        majaDivi.griestuAugstums=3.2;
        majaDivi.kadastralaVertiba=25000;
        majaDivi.loguSkaits=30;
        majaDivi.stavuDaudzums=3;
        majaDivi.vaiPrivatipasums=false;
        majaDivi.printHouse();

      House[] majas = {majaViens, majaDivi};
        for (House maja : majas) {
            maja.printHouse();

        }

        velosipeds mansVelo = new velosipeds();
        mansVelo.atrums = 2;

        velosipeds ritenBraucejsViens = new velosipeds();
        velosipeds ritenBraucejsDivi = new velosipeds();

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        velosipeds ritenBraucejsTris = new velosipeds();
        ritenBraucejsDivi.printAtrums();

        ritenBraucejsDivi.paatrinajums();
        ritenBraucejsDivi.paatrinajums();
        ritenBraucejsDivi.paatrinajums();

        ritenBraucejsDivi.printAtrums();



        auto masinaViens = new auto();
        masinaViens.apdrosinana = true;
        masinaViens.krasa = "balta";
        masinaViens.durvjuSkaits = 4;
        masinaViens.marka = "KIA";
        masinaViens.nobraukums = 70000;
        masinaViens.printAuto();


Rinkis rinkisViens = new Rinkis();
rinkisViens.r=5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatRinkaLinijasGarumu());




    }


    }

