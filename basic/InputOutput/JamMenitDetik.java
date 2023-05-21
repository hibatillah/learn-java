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
public class JamMenitDetik {
    public static void main(String[] args) {
        int jam;
        int menit;
        int detik;
        int detik2;
        
        jam = Integer.parseInt(JOptionPane.showInputDialog("Berapa jam: "));
        menit = Integer.parseInt(JOptionPane.showInputDialog("Berapa menit: "));
        detik = jam*3600;
        detik2 = menit*60;
        
        JOptionPane.showMessageDialog(null,+jam+" jam "+menit+" menit = "+(detik+detik2)+" detik");
        
        
    }
    
}
