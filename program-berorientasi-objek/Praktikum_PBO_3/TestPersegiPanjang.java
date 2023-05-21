package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class TestPersegiPanjang {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Persegi Panjang: "));
        int i;

        PersegiPanjang P[] = new PersegiPanjang[n];
        for (i=0; i<n; i++){
            P[i] = new PersegiPanjang();
        }

        for (i=0; i<n; i++){
            JOptionPane.showMessageDialog(null, "Input Persegi Panjang ke "+(i+1));
            P[i].getData();
        }

        for (i=0; i<n; i++){
            P[i].toString();
            System.out.println();
        }
    }
    
}
