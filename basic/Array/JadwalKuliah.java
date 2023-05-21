package Array;

import javax.swing.JOptionPane;

public class JadwalKuliah {
    public static void main(String[] args) {
        String jurusan = "Sistem Informasi";
        String waktu,waktu2,pilihan;
        double omrik = 50000;
        double biaya, totalbayar;
        
        waktu = JOptionPane.showInputDialog("Waktu Kuliah: \n(PG) Pagi"+
                "\n(SG) Siang\n(MA) Malam\n(XC) Executive\n");
        if (waktu.equalsIgnoreCase("PG")){
            biaya = 1200000;
            waktu2 = "Pagi";
            pilihan = "PG";
        } else if (waktu.equalsIgnoreCase("SG")){
            biaya = 1300000;
            waktu2 = "Siang";
            pilihan = "SG";
        } else if (waktu.equalsIgnoreCase("MA")){
            biaya = 1500000;
            waktu2 = "Malam";
            pilihan = "MA";
        } else if (waktu.equalsIgnoreCase("XC")){
            biaya = 2000000;
            waktu2 = "Hari minggu";
            pilihan = "XC";
        } else {
            biaya = 0;
            waktu2 = "tidak valid";
            pilihan = "tidak valid";
        }
        totalbayar = biaya + omrik;
        
        if (biaya==0){
            System.out.println("Data tidak valid");
        } else {
        System.out.println("Pilihan\t: "+pilihan+"\nNama jurusan\t: "+jurusan+
                "\nWaktu kuliah\t: "+waktu2+"\nBiaya kuliah\t: Rp"+biaya+
                "\nBiaya Omrik\t: Rp50000"+"\nTotal bayar\t: Rp"+totalbayar);
        }
        
    }
    
}
