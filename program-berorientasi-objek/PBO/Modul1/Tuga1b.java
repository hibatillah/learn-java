package PBO.Modul1;
import javax.swing.JOptionPane;
// tugas 1b

public class Tuga1b {
    public static void main(String[] args) {
        int pilihan; 
        double sisi, tinggi, jari;

        Tugas1a obj = new Tugas1a();

        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihlah: "
            +"\n1. untuk menghitung luas dan keliling persegi"
            +"\n2. untuk menghitung luas dan keliling segitiga"
            +"\n3. untuk menghitung luas dan keliling lingkaran"));

        switch (pilihan){
            case 1:
                sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi persegi: "));
                obj.luasPersegi(sisi);
                obj.kelilingPersegi(sisi);
                break;
            case 2:
                sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi segitiga: "));
                tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));
                obj.luasSegitiga(sisi, tinggi);
                obj.kelilingSegitiga(sisi);
                break;
            case 3:
                jari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari lingkaran: "));
                obj.luasLingkaran(jari);
                obj.kelilingLingkaran(jari);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Masukan anda salah...");
        }
        
    }
    
}
