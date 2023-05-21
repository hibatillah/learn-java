package Array;

import javax.swing.JOptionPane;

public class Pesawat {
    public static void main(String[] args) {
        String pesawat = JOptionPane.showInputDialog("Pilihan Penerbangan\n- Garuda\n- Lion\n- Batavia");
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah tiket: "));
        String namapesawat,hargadiskon;
        double harga, diskon, total;
        
        if (pesawat.equalsIgnoreCase("garuda")){
            namapesawat = "Garuda";
            if (jumlah>=100){
                harga = 400000;
                total = jumlah*harga;
                diskon = total*0.5;
                hargadiskon = "50%";
            } else {
                harga = 0;
                total = 0;
                diskon = 0;
                hargadiskon = "-";
            }
        } else if (pesawat.equalsIgnoreCase("lion")){
            namapesawat = "Lion";
            if (jumlah>=50){
                harga = 300000;
                total = jumlah*harga;
                diskon = total*0.1;
                hargadiskon = "10%";
            } else {
                harga = 0;
                total = 0;
                diskon = 0;
                hargadiskon = "-";
            }
        } else if (pesawat.equalsIgnoreCase("batavia")){
            namapesawat = "Batavia";
            if (jumlah>=20){
                harga = 200000;
                total = jumlah*harga;
                diskon = 0;
                hargadiskon = "-";
            } else {
                harga = 0;
                total = 0;
                diskon = 0;
                hargadiskon = "-";
            }
        } else {
            namapesawat = "tidak valid";
            harga = 0;
            total = 0;
            diskon = 0;
            hargadiskon = "-";
        }
        double totalbayar = total + diskon;
        
        if (namapesawat.equals("tidak valid") || harga==0){
            System.out.println("Data Tidak valid");
        } else {
        System.out.println("Nama pesawat\t: "+namapesawat+"\nHarga tiket\t: Rp"+
                harga+"\nJumlah tiket\t: "+jumlah+" buah\nBiaya total\t: Rp"+total+
                "\nDiskon\t\t: "+hargadiskon+"\nTotal akhir\t: Rp"+totalbayar);
        }
    }
    
}
