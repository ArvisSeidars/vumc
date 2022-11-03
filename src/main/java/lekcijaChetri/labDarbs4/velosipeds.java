package lekcijaChetri.labDarbs4;

import java.sql.SQLOutput;
import java.util.Date;

public class velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;

    public void printAtrums(){
        System.out.println(atrums);
        System.out.println(zimols);
    }
     public void paatrinajums() {
         System.out.println("Velo paātrinās");
         atrums = atrums + 5;
     }

        public void bremzee(){
             if (atrums >= 5) {
                System.out.println("Velo Bremze");
                atrums = atrums - 5;
            } else {
                System.out.println("Beidz bremzēt, tu jau stāvi");
            }
                      }

        }








