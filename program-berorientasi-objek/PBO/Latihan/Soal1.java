package PBO.Latihan;

import javax.swing.JOptionPane;

public class Soal1 {
    public static void main(String[] args) {
        double alas = Double.parseDouble(JOptionPane.showInputDialog("alas segitiga: "));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("tinggi segitiga: "));
        double luas, keliling;
        
        luas = (alas*tinggi)/2;
        keliling = alas*3;
        
        System.out.println("Alas Segitiga : "+alas+" cm\nTinggi Segitiga : "+tinggi+" cm");
        System.out.println("Luas Segitiga = "+luas+" cm2\nKeliling Segitiga = "+keliling+" cm");
        
    }
    
}
