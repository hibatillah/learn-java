package PBO.Modul1;

import javax.swing.JOptionPane;

public class Coba3 {
    static void volumeKubus(double sisi){
       double volume=sisi*sisi*sisi;
       JOptionPane.showMessageDialog(null, "volume kubus : "+volume);
    }
    static double volumeBalok(double panjang,double lebar,double tinggi){
       double volume=panjang*lebar*tinggi;
       return volume;
    }
    static void volumeTabung(double jari, double tinggi){
       double volume=3.14*jari*jari*tinggi;
       JOptionPane.showMessageDialog(null, "volume Tabung : "+volume);
    }
    static void volumeKerucut(double jari, double tinggi){
       double volume=1/3*3.14*jari*jari*tinggi;
       JOptionPane.showMessageDialog(null, "volume Kerucut : "+volume);
    }

    public static void main(String[] args) {
        int pilihan;
        double sisiKubus, panjang,lebar,tinggi,jari,volume;
       
        pilihan =Integer.parseInt(JOptionPane.showInputDialog("Pilihlah:"
               + "\n1. Jika inging menghitung volume kubus"
               + "\n2. Jika ingin menghitung volume balok"
               + "\n3. Jika ingin menghitung volume tabung"
               + "\n4. Jika ingin menghitung volume kerucut"));
       
         switch (pilihan){
            case 1 :
               sisiKubus=Double.parseDouble(JOptionPane.showInputDialog("Masukan sisi kubus : "));
               
               volumeKubus(sisiKubus);
               break;
            case 2 :
               panjang=Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang balok : "));
               lebar=Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar balok : "));
               tinggi=Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi balok : "));
               
               JOptionPane.showMessageDialog(null,"Volume balok : "+volumeBalok(panjang, lebar, tinggi));
                break;
            case 3 :
               jari=Double.parseDouble(JOptionPane.showInputDialog("Masukan jari tabung : "));
               tinggi=Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi tabung : "));
               
               volumeTabung(jari, tinggi);
               break;
            case 4 :
               jari=Double.parseDouble(JOptionPane.showInputDialog("Masukan jari kerucut : "));
               tinggi=Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi kerucut : "));
               
               volumeKerucut(jari, tinggi);
               break;
            default :
               JOptionPane.showMessageDialog(null, "Masukan anda salah...");
        }
        
    }
    
}
