package PBO.Modul1;
import javax.swing.JOptionPane;
//tugas 3a class driver

public class Tugas3a {
    public void siswa(String nama, String kelas){
        System.out.println(nama + " dari kelas "+ kelas);
    }

    public void guru(String nama, String mapel){
        System.out.println("Guru "+ nama +", mengampu mata pelajaran "+ mapel);
    }
    
    public double nilaiAkhir(double tugas, double uts, double uas){
        double nilaiAkhir = (tugas + uts + uas)/3;
        return nilaiAkhir;
    }
}
