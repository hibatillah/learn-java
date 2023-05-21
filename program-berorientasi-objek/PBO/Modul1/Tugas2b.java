package PBO.Modul1;
//tugas 2b

import javax.swing.JOptionPane;

public class Tugas2b {
    public static void main(String[] args) {
        double nilai;
        Tugas2a huruf = new Tugas2a();

        nilai = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai anda: "));
        System.out.println("Nilai anda "+ nilai);
        huruf.grade(nilai);
        
    }
    
}
