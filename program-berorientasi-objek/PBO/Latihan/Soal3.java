package PBO.Latihan;

import javax.swing.JOptionPane;

public class Soal3 {
    public static void main(String[] args) {
        double celcius,fahrenheit, reamur;
        String pilih = JOptionPane.showInputDialog("pilih konversi suhu\n1. Celcius -> Fahrenheit\n"
                + "2. Celcius -> Reamur\n3. Fahrenheit -> Reamur\n4. Fahrenheit -> Celcius\n"
                + "5. Reamur -> Celcius\n6. Reamur -> Fahrenheit");
        
        if (pilih.equals("1")){
            celcius = Double.parseDouble(JOptionPane.showInputDialog("Celcius:"));
            fahrenheit = (celcius*9/5)+32;
            System.out.println(celcius+" C = "+fahrenheit+" F");
        } 
        else if (pilih.equals("2")){
            celcius = Double.parseDouble(JOptionPane.showInputDialog("Celcius:"));
            reamur = celcius*4/5;
            System.out.println(celcius+" C = "+reamur+" R");
        } 
        else if (pilih.equals("3")){
            fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Fahrenheit:"));
            reamur = (fahrenheit-32)*4/9;
            System.out.println(fahrenheit+" F = "+reamur+" R");
        } 
        else if (pilih.equals("4")){
            fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Fahrenheit:"));
            celcius = (fahrenheit-32)*5/9;
            System.out.println(fahrenheit+" F = "+celcius+" C");
        } 
        else if (pilih.equals("5")){
            reamur = Double.parseDouble(JOptionPane.showInputDialog("Reamur:"));
            celcius = reamur/0.8;
            System.out.println(reamur+" R = "+celcius+" C");
        } 
        else if (pilih.equals("6")){
            reamur = Double.parseDouble(JOptionPane.showInputDialog("Reamur:"));
            fahrenheit =  (reamur*2.25)+32;
            System.out.println(reamur+" R = "+fahrenheit+" F");
        }
        
    }
    
}
