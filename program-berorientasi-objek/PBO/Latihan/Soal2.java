package PBO.Latihan;

import javax.swing.JOptionPane;

public class Soal2 {
    public static void main(String[] args) {
        double bil1 = Double.parseDouble(JOptionPane.showInputDialog("bilangan pertama: "));
        String tanda = JOptionPane.showInputDialog("pilih salah satu tanda\n+ - x / ");
        double bil2 = Double.parseDouble(JOptionPane.showInputDialog("bilangan kedua: "));
        double hasil=0;
        
        if (tanda.equalsIgnoreCase("x")){
            hasil = bil1*bil2;
        } else if (tanda.equalsIgnoreCase("/")){
            hasil = bil1/bil2;
        } else if (tanda.equalsIgnoreCase("+")){
            hasil = bil1+bil2;
        } else if (tanda.equalsIgnoreCase("-")){
            hasil = bil1-bil2;
        }
        System.out.println("\n"+bil1+" "+tanda+" "+bil2+" = "+hasil);
    }
    
}
