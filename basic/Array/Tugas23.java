package Array;

import javax.swing.JOptionPane;

public class Tugas23 {
    public static void main(String[] args) {
        int nilai[] = new int[5];
        String nama[] = new String[5];
        String namamax = null;
        int max = nilai[0];
        
        System.out.println("Nama\tNilai");
        for (int i=0; i<nilai.length; i++){
            nama[i] = JOptionPane.showInputDialog("Nama ke "+(i+1)+" : ");
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("input nilai ke "+(i+1)+" :"));
            System.out.println(nama[i]+"\t"+nilai[i]);
            
            if (i==0){
                max = nilai[i];
                namamax = nama[i];
            } else if (nilai[i]>max){
                max = nilai[i];
                namamax = nama[i];
            }
        }
        System.out.println("Nilai tertinggi "+max+" oleh "+namamax);
    }
    
}
