package PBO.Modul1;
import javax.swing.JOptionPane;
// percobaan 6.1

public class VolumeBangunRuang {
    public void volumeKubus(double sisi){
        double volume = sisi*sisi*sisi;
        JOptionPane.showMessageDialog(null, "volume kubus: "+volume);
    }

    public double volumeBalok(double panjang, double lebar, double tinggi){
        double volume = panjang*lebar*tinggi;
        return volume;
    }
}