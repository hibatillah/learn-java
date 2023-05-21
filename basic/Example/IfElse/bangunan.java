package Example.IfElse;

import javax.swing.JOptionPane;

public class bangunan {
    public static void main(String[] args) {
        int pilihan, panjang, lebar, luaspersegi, sisi, tinggi, luastiga;
        double jari, phi, luaslingkar;

        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan bangunan:\n1. Persegi"+
        "\n2. Segitiga\n3. Lingkaran"));

        if (pilihan == 1) {
            panjang = Integer.parseInt(JOptionPane.showInputDialog("panjang persegi: "));
            lebar = Integer.parseInt(JOptionPane.showInputDialog("lebar persegi: "));
            luaspersegi = panjang*lebar;
            JOptionPane.showMessageDialog(null, "panjang "+panjang+" cm\nlebar "+lebar+" cm\nLuas = "+luaspersegi);
        }
        else if (pilihan == 2) {
            sisi = Integer.parseInt(JOptionPane.showInputDialog("sisi segitiga: "));
            tinggi = Integer.parseInt(JOptionPane.showInputDialog("tinggi segitiga: "));
            luastiga = sisi*tinggi/2;
            JOptionPane.showMessageDialog(null,"sisi "+sisi+" cm\ntinggi "+tinggi+" cm\nLuas = "+luastiga);
        }
        else if (pilihan == 3) {
            jari = Double.parseDouble(JOptionPane.showInputDialog("jari-jari: "));
            phi = 3.14;
            luaslingkar = phi*Math.pow(jari, 2);
            JOptionPane.showMessageDialog(null, "jari-jari "+jari+" cm\nphi "+phi+" cm\nLuas = "+luaslingkar);
        }
        else {
            JOptionPane.showMessageDialog(null, "kode tidak valid");
        }

    }
    
}
