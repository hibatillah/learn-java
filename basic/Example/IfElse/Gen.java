package Example.IfElse;

import java.util.Scanner;

public class Gen {
    public static void main(String[] args) {
        String nama, gen;
        int lahir;

        Scanner input = new Scanner (System.in);

        System.out.println("Siapa nama anda: ");
        nama = input.next();
        System.out.println("Tahun lahir anda: ");
        lahir = input.nextInt();

        if (lahir>=1944 && lahir<=1964){
            gen = "baby boomer";
        } else if (lahir>=1965 && lahir<=1979){
            gen = "x";
        } else if (lahir>=1980 && lahir<=1994){
            gen = "y (milenials)";
        } else if (lahir>=1995 && lahir<=2010){
            gen = "z";
        } else if (lahir>=2011 && lahir<=2021){
            gen = "alpha";
        } else {
            gen = "tidak valid";
        }
        if (gen == "tidak valid"){
            System.out.println("Nama anda adalah "+nama+", anda lahir tahun "+lahir+
            "\nmaaf anda tidak termasuk dalam generasi manapun");
        } else{
            System.out.println("Nama anda adalah "+nama+", anda lahir tahun "+lahir+
            "\nanda adalah generasi "+gen+".");
        }
        
    }
    
}
