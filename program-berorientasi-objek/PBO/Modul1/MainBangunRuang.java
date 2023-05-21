package PBO.Modul1;
import javax.swing.JOptionPane;
// percobaan 6.2

public class MainBangunRuang {
    public static void main(String[] args) {
        int pilihan;
        double sisiKubus, panjang, lebar, tinggi;

        VolumeBangunRuang objBangunDatar = new VolumeBangunRuang();

        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihlah: "
            +"\n1. Jika ingin menghitung volume kubus"
            +"\n2. Jika ingi menghitung volume balok"));

        if (pilihan==1){
            sisiKubus = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi kubus: "));

            objBangunDatar.volumeKubus(sisiKubus);
        }
        else if (pilihan==2){
            panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang balok: "));
            lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar balok: "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi balok: "));

            JOptionPane.showMessageDialog(null, objBangunDatar.volumeBalok(panjang, lebar, tinggi));
        }
        else {
            JOptionPane.showMessageDialog(null, "Masukkan anda salah...");
        }
    }
    
}
