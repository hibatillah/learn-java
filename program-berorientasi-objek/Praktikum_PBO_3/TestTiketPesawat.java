package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class TestTiketPesawat {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Tiket"));
        int i;

        TiketPesawat T[] = new TiketPesawat[n];
        for (i=0; i<n; i++){
            T[i] = new TiketPesawat();
        }

        for (i=0; i<n; i++){
            JOptionPane.showMessageDialog(null, "Tiket "+(i+1));
            T[i].getData();
        }

        System.out.println("ID\tNama\tMaskapai\tNo. Kursi\tHarga\t\tJam\t\tKonfirmasi Keberangkatan");
        for (i=0; i<n; i++){
            T[i].infoTiket();
        }
    }
    
}
