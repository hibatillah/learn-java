/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import javax.swing.JOptionPane;

/**
 *
 * @author hibat
 */
public class balik {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("jumlah: "));
        String bil[][] = new String[n][n];
        String tanda = "*";
        
        for (int i=0; i<bil.length; i++){
            for (int j=0; j<bil[i].length; i++){
                if (i==j){
                    bil[i][j] = tanda;
                } else {
                    bil[i][j] = " ";
                }
            }
        }
        
        for (int i=0; i<bil.length; i++){
            for (int j=0; j<bil[i].length; j++){
                System.out.print(bil[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
