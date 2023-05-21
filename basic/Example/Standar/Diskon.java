package Example.Standar;

import javax.swing.JOptionPane;

public class Diskon {
    public static void main(String[] args) {
        int celana, baju, diskoncelana, diskonbaju;
        double hargacelana, hargabaju, hargadiskonbaju, hargadiskoncelana; 
        double celanasudahdiskon, bajusudahdiskon, total, totaldiskon, hargatotal;

        celana = Integer.parseInt(JOptionPane.showInputDialog("Jumlah celana: "));
        baju = Integer.parseInt(JOptionPane.showInputDialog("Jumlah baju: "));
        hargacelana = Double.parseDouble(JOptionPane.showInputDialog("Harga celana: "));
        hargabaju = Double.parseDouble(JOptionPane.showInputDialog("Harga baju: "));
        diskoncelana = Integer.parseInt(JOptionPane.showInputDialog("Diskon celana (%): "));
        diskonbaju = Integer.parseInt(JOptionPane.showInputDialog("Diskon baju (%): "));

        hargadiskoncelana = (diskoncelana/100)*celana*hargacelana;
        hargadiskonbaju = (diskonbaju/100)*celana*hargabaju;
        celanasudahdiskon = (celana*hargacelana)*hargadiskoncelana;
        bajusudahdiskon = (baju*hargabaju)*hargadiskonbaju;

        total = ((celana * hargacelana)-hargadiskoncelana) - ((baju * hargabaju)-hargadiskonbaju);
        totaldiskon = total* 10/100;
        hargatotal = total - totaldiskon;

        System.out.println("Jumlah celana: "+celana+" buah"+
        "\nHarga celana: "+hargacelana+"k rupiah"+"\nJumlah baju: "+baju+" buah"+
        "\nHarga baju: "+hargabaju+"k rupiah"+"\n\nDiskon celana: "+diskoncelana+"%"+
        "\nDiskon baju: "+diskonbaju+"%"+"\n\nHarga celana setelah diskon: "+celanasudahdiskon+
        "k rupiah"+"\nHarga baju setelah diskon: "+bajusudahdiskon+"k rupiah"+
        "\n\nTotal belanja = "+hargatotal+"k rupiah");
    }
    
}
