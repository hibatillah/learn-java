/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.IfElse;
import javax.swing.JOptionPane;

/**
 *
 * @author hibat
 */
public class NilaiRata {
    public static void main(String[] args) {
        int a,b,c;
        float rata;
        String huruf;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Nilai Tugas : "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Nilai UTS : "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Nilai UAS : "));
        rata = (a+b+c)/3;
        
        if (rata>=90) {
            huruf = "A";
        } else if (rata<90 && rata>= 80){
            huruf = "B";
        } else if (rata>=70 && rata<80){
            huruf = "C";
        } else if (rata>=60 && rata<70){
            huruf = "D";
        } else {
            huruf = "E";
        }
        System.out.println("Nilai rata-rata"+"\t\tNilai huruf");
        System.out.println("\t"+rata+"\t\t\t"+huruf);
    }
    
}
