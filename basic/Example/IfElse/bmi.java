package Example.IfElse;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        String nama, ket;
        double berat, tinggi, bmi;

        Scanner input = new Scanner (System.in);
        System.out.println("Nama anda: ");
        nama = input.next();
        System.out.println("Tinggi badan(cm): ");
        tinggi = input.nextDouble();
        System.out.println("Berat badan(kg): ");
        berat = input.nextDouble();

        tinggi = tinggi*Math.pow(10, -2);
        bmi = berat/(tinggi*tinggi);

        if (bmi<18.5){
            ket = "Kurus";
        } else if (bmi>=18.5 && bmi<25){
            ket = "Langsing";
        } else if (bmi>25){
            ket = "Gemuk";
        } else{
            ket = "tidak valid";
        }
        
        System.out.println("Nama anda "+nama+"\ntinggi badan "+tinggi+" m\nberat badan "+
        berat+" kg\nBMI anda "+bmi+", anda "+ket);

    }
    
}
