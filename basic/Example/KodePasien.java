package Example;

import javax.swing.JOptionPane;

public class KodePasien {
    public static void main(String[] args) {
        String nama, namakamar, namadokter, kodepasien, kodekamar, kodedokter, status, diskon;
        int biayadaftar, biayakamar, biayaperiksa, menginap, totalbayar, pasien, i=1;
        double diskoninap, total;

        pasien = Integer.parseInt(JOptionPane.showInputDialog("Jumlah pasien: "));

        if (pasien<1){
            System.out.println("Jumlah pasien tidak valid");
        } else {
            do {
                nama = JOptionPane.showInputDialog("Nama pasien: ");
                kodepasien = JOptionPane.showInputDialog("Kode pasien: ");
                kodekamar = JOptionPane.showInputDialog("Kode kamar: ");
                menginap = Integer.parseInt(JOptionPane.showInputDialog("Lama menginap (hari): "));
                kodedokter = JOptionPane.showInputDialog("Kode dokter: ");

                switch (kodepasien){
                    case "PS0001":
                        status = "Pasien baru";
                        biayadaftar = 500;
                        break;
                    case "PS0002":
                        status = "Pasien lama";
                        biayadaftar = 400;
                        break;
                    case "PS0003":
                        status = "Pasien BPJS";
                        biayadaftar = 300;
                        break;
                    case "PS0004":
                        status = "Pasien Askes";
                        biayadaftar = 200;
                        break;
                    default:
                        status = "tidak terdaftar";
                        biayadaftar = 0;
                        break;
                }
                switch (kodekamar){
                    case "1111":
                        namakamar = "Melati";
                        biayakamar = 1000;
                        break;
                    case "2222":
                        namakamar = "Mawar";
                        biayakamar = 2000;
                        break;
                    case "3333":
                        namakamar = "Dahlia";
                        biayakamar = 3000;
                        break;
                    case "4444":
                        namakamar = "Anggrek";
                        biayakamar = 4000;
                        break;
                    case "5555":
                        namakamar = "tulip";
                        biayakamar = 5000;
                        break;
                    default:
                        namakamar = "tidak terdaftar";
                        biayakamar = 0;
                        break;
                }
                switch (kodedokter){
                    case "DK001":
                        namadokter = "Dr. Andi";
                        biayaperiksa = 500;
                        break;
                    case "DK002":
                        namadokter = "Dr. Joko";
                        biayaperiksa = 400;
                        break;
                    case "DK003":
                        namadokter = "Dr. Karni";
                        biayaperiksa = 300;
                        break;
                    case "DK004":
                        namadokter = "Dr. Amin";
                        biayaperiksa = 200;
                        break;
                    case "DK005":
                        namadokter = "Dr. Udin";
                        biayaperiksa = 100;
                        break;
                    default:
                        namadokter = "tidak terdaftar";
                        biayaperiksa = 0;
                        break;
                }
                if (menginap > 10){
                    diskoninap = 0.5;
                    diskon = "50%";
                } else if (menginap > 8){
                    diskoninap = 0.4;
                    diskon = "40%";
                } else if (menginap > 6){
                    diskoninap = 0.3;
                    diskon = "30%";
                } else if (menginap > 4){
                    diskoninap = 0.2;
                    diskon = "20%";
                } else if (menginap > 1){
                    diskoninap = 0.1;
                    diskon = "10%";
                } else {
                    diskoninap = 0;
                    diskon = "-";
                }
                totalbayar = biayadaftar + biayakamar + biayaperiksa;
                total = totalbayar - (totalbayar*diskoninap);
                
                if ((status=="tidak terdaftar" || namakamar=="tidak terdaftar") && (namadokter=="tidak terdaftar" && diskoninap==0)){
                    System.out.println("Data Tidak Valid!!");
                } else{
                    System.out.println("Nama pasien\t: "+nama+"\nStatus Pasien\t: "+status+"\nBiaya daftar\t: "+
                    biayadaftar+"k"+"\nNama kamar\t: "+namakamar+"\nBiaya kamar\t: "+biayakamar+"k"+"\nNama dokter\t: "+
                    namadokter+"\nBiaya periksa\t: "+biayaperiksa+"k"+"\nDiskon\t: "+diskon+"\nTotal bayar\t: "+total+"k ");
                }
                i++;
            }
            while (i <= pasien);
        }
        
    }
    
}
