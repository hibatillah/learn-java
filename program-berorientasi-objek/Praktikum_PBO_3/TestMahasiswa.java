package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class TestMahasiswa {
    public static void main(String[] args) {
        int i, n=10;

        Mahasiswa m[] = new Mahasiswa[n];
        for (i=0; i<n; i++){
            m[i] = new Mahasiswa();
        }

        JOptionPane.showMessageDialog(null, "Input Data Mahasiswa");
        for (i=0; i<n; i++){
            JOptionPane.showMessageDialog(null, "Mahasiswa "+(i+1));
            m[i].getData();
        }

        System.out.println("Data Mahasiswa");
        System.out.println("Nama\t\tNIM\t\tJurusan");
        for (i=0; i<n; i++){
            m[i].infoData();
        }
        
    }
    
}
