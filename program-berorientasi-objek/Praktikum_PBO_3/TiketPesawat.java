package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class TiketPesawat {
    String id, nama, maskapai, jamBerangkat, konfirmBerangkat;
    int noKursi;
    double harga;

    TiketPesawat(){
        id = nama = maskapai =jamBerangkat = null;
        noKursi = 0;
        harga = 0;
    }

    void getData(){
        id = JOptionPane.showInputDialog("ID Penerbangan");
        nama = JOptionPane.showInputDialog("Nama ");
        maskapai = JOptionPane.showInputDialog("Maskapai Penerbangan");
        noKursi = Integer.parseInt(JOptionPane.showInputDialog("No. Kursi"));
        harga = Double.parseDouble(JOptionPane.showInputDialog("Harga Penerbangan"));
        jamBerangkat = JOptionPane.showInputDialog("Jam keberangkatan");

        switch (maskapai){
            case "Lion Air":
                konfirmBerangkat = "Delay";
                break;
            case "Citilink":
                konfirmBerangkat = "Delay";
                break;
            default:
                konfirmBerangkat = "Keberangkatan sesuai jadwal";
                break;
        }
    }
    
    void infoTiket(){
        System.out.println(id+"\t"+nama+"\t"+maskapai+"\t"+noKursi+"\t\t"+harga+"\t"+jamBerangkat+"\t\t"+konfirmBerangkat);
    }
}
