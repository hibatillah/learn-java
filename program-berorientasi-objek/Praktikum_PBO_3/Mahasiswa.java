package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class Mahasiswa {
    String nama, nim, jurusan;

    Mahasiswa(){
        nama = nim = jurusan = null;
    }

    void getData(){
        nama = JOptionPane.showInputDialog("Nama: ");
        nim = JOptionPane.showInputDialog("NIM: ");
        jurusan = JOptionPane.showInputDialog("Jurusan: ");
    }

    void infoData(){
        System.out.println(nama+"\t\t"+nim+"\t"+jurusan);
    }
    
}
