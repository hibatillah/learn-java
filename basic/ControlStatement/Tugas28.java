package ControlStatement;

import javax.swing.JOptionPane;

public class Tugas28 {
    public static void main(String[] args) {
        String nama, ket, huruf;
        double nilai;
        double max = 0;
        String namamax = null;
        
        System.out.println("Nama\tNilai\tGrade");
        for (int i=1; i<=5; i++){
            nama = JOptionPane.showInputDialog("Nama anda: ");
            nilai = Integer.parseInt(JOptionPane.showInputDialog("Nilai anda: "));
        
            if (nilai>=1 && nilai<=100){
                if (nilai>80){
                    huruf = "A";
                } else if (nilai>70){
                    huruf = "B";
                } else if (nilai>60){
                    huruf = "C";
                } else{
                    huruf = "F";
                }
            } else{
                System.out.println("Nilai tidak valid");
                break;
            }
            if (i==1){
                max = nilai;
                namamax = nama;
            } else if (nilai>max){
                max = nilai;
                namamax = nama;
            }
            System.out.println(nama+"\t"+nilai+"\t"+huruf);
        }
        System.out.println("Nilai tertinggi "+max+" oleh "+namamax);
        
    }
    
}
