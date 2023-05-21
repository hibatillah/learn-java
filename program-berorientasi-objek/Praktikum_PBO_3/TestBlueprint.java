package Praktikum_PBO_3;
import Another_Praktikum_PBO_3.*;
import javax.swing.JOptionPane;

public class TestBlueprint {
    public static void main(String[] args) {
        int bil1 = Integer.parseInt(JOptionPane.showInputDialog("Input bilangan pertama: "));
        double bil2 = Double.parseDouble(JOptionPane.showInputDialog("Input bilangan kedua: "));
        String tanda = JOptionPane.showInputDialog("Pilih operasi yang ingin dilakukan:\nTulis lambang\nTambah(+)\nKurang(-)");

        Blueprint b1 = new Blueprint(bil1, bil2);
        System.out.println(bil1+" "+tanda+" "+bil2+" = "+b1.Hitung(tanda));


    }
    
}

