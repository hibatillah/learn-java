package PBO.Modul1;
import javax.swing.JOptionPane;
//tugas 2a class driver

public class Tugas2a {
    public void grade(double nilai){
        String huruf = null;
        if (nilai>0  && nilai<=100){
            if (nilai>80){
                huruf = "A";
            } else if (nilai>75){
                huruf = "AB";
            } else if (nilai>65){
                huruf = "B";
            } else if (nilai>60){
                huruf = "BC";
            } else if (nilai>50){
                huruf = "C";
            } else {
                huruf = "F";
            }
        } else {
            System.out.println("Nilai anda tidak valid!!");
        }
        System.out.println("mendapatkan grade "+huruf);
    }
    
}
