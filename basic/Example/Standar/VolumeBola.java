/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Standar;

import javax.swing.JOptionPane;


/**
 *
 * @author 284-PC13
 */
public class VolumeBola {
    public static void main(String[] args) {
        double r;
        double phi;
        double v;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("jari : "));
        phi = 3.14;
        v = phi*(Math.pow(r, 3));
        v = v*(4/3);
        
        JOptionPane.showMessageDialog(null, "Jari-jari Bola : "+r+"\nVolume Bola = "+v);
    }
    
}
