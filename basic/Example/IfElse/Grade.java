package Example.IfElse;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String grade, ket;

        System.out.println("input nilai: ");
        int nilai = input.nextInt();

        if (nilai>=90 && nilai<=100){
            grade = "A";
            ket = "sempurna";
        } else if (nilai>=75 && nilai<90){
            grade = "B";
            ket = "baik";
        } else if (nilai>=60 && nilai<75){
            grade = "C";
            ket = "cukup";
        } else if (nilai>=40 && nilai<60){
            grade = "D";
            ket = "kurang";
        } else if (nilai>=0 && nilai<40){
            grade = "E";
            ket = "buruk";
        } else{
            grade = "tidak valid";
            ket = "tidak valid";
        }

        if (grade=="tidak valid"){
            System.out.println("nilai tidak valid");
        }else{
            System.out.println("nilai anda "+nilai+
            ", anda dapat "+grade+"\nnilai anda "+ket);
        }
    }
    
}
