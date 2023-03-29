/*Nama    : Iit al arwaihti*/
 /*Stambuk : 13020210037*/
 /*Kelas   : B1*/

import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        int mill, km  ;
        System.out.print("Berapa mill yang ingin anda konversikan ke Meter: ");
        mill = input.nextInt();



          km = (int) (mill*1609);
            
            System.out.println("Konversi dari : "+ mill +" Mill, Adalah : ");
            System.out.println(km+" Meter ");
        }
    }
    
}