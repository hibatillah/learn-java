/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.loop;
import javax.swing.JOptionPane;

/**
 *
 * @author hibat
 */
public class DemoWhile {
    public static void main(String[] args) {
        int a;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("a : "));
        
        while (a<100){
            System.out.println("Nilai a = "+a);
            a = (int) (Math.pow(a, 2));
        }
    }
    
}
