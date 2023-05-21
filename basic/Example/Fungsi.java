package Example;

import javax.swing.JOptionPane;

public class Fungsi {
    public static void main(String[] args) {
        System.out.println("Nama\tNilai\tStatus");
        for (int i=1; i<=5; i++){
            String nama = JOptionPane.showInputDialog("Nama siswa\t: ");
            int nilai = Integer.parseInt(JOptionPane.showInputDialog("Nilai siswa\t: "));
            siswa(nama,nilai);
        }
    }
    
    public static void siswa(String nama, int nilai) {
        String ket;
        if (nilai>=1 && nilai<=100){
            if (nilai>60){
                ket = "Lulus";
            } else {
                ket = "Gagal";
            }
            System.out.println(nama+"\t"+nilai+"\t"+ket);
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
    
}
