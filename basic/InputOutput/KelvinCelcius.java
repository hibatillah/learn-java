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
public class KelvinCelcius {
    public static void main(String[] args) {
        double kelvin;
        double celcius;
        
        
        kelvin = Double.parseDouble(JOptionPane.showInputDialog("Kelvin: "));
        celcius = kelvin-273;
        
        JOptionPane.showMessageDialog(null, +kelvin+" Kelvin = "+celcius+" Celcius");
                
    }
    
}
