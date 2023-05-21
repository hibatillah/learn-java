/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import javax.swing.JOptionPane;


/**
 *
 * @author 284-PC13
 */
public class TahunBulanHari {
    public static void main(String[] args) {
        int tahun;
        int bulan;
        int hari;
        int hari2;
        
        tahun = Integer.parseInt(JOptionPane.showInputDialog("Berapa tahun: "));
        bulan = Integer.parseInt(JOptionPane.showInputDialog("Berapa bulan: "));
        hari = tahun*365;
        hari2 = bulan*30;
        
         JOptionPane.showMessageDialog(null, +tahun+" tahun "+bulan+" bulan = "+(hari+hari2)+" hari");
         
    }
    
}
