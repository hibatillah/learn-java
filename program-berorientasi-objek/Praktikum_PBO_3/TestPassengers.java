package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class TestPassengers {
    public static void main(String[] args) {
        int n = 6;
        int i;

        Passengers p[] = new Passengers[n];
        for (i=0; i<n; i++){
            p[i] = new Passengers();
        }

        JOptionPane.showMessageDialog(null, "Input Data Penumpang");
        for (i=0; i<n; i++){
            JOptionPane.showMessageDialog(null, "Penumpang "+(i+1));
            p[i].getData();
        }

        System.out.println("Data Penumpang");
        System.out.println("Nama\t\tUmur\tGender\tDestinasi\tKeterangan");
        for (i=0; i<n; i++){
            p[i].infoData();
        }
    }
    
}
