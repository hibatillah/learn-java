package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class PersegiPanjang {
    double panjang, lebar, luas, keliling;

    PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void getData(){
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Panjang Persegi Panjang: "));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Lebar Persegi Panjang: "));
    }

    double luasPP(){
        luas = panjang * lebar;
        return luas;
    }

    double kelilingPP(){
        keliling = (panjang*2) + (lebar*2);
        return keliling;
    }

    public String toString(){
        System.out.println("Panjang\t: "+panjang
            +"\nLebar\t\t: "+lebar
            +"\nLuas\t\t: "+luasPP()
            +"\nKeliling\t: "+kelilingPP());
        return null;
    }
    
}
