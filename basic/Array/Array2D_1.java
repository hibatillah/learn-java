
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab-284
 */
public class Array2D_1 {
    public static void main(String[] args) {
        String mhs[][] = new String[3][3];
        
        for (int i=0; i<mhs.length; i++){
            int j=0;
                mhs[i][j] = JOptionPane.showInputDialog("Nama");
        }
        for (int i=0; i<mhs.length; i++){
            int j=1;
                mhs[i][j] = JOptionPane.showInputDialog("Prodi");
        }
        for (int i=0; i<mhs.length; i++){
            int j=2;
                mhs[i][j] = JOptionPane.showInputDialog("Jurusan");
        }
        System.out.println("Nama\tProdi\tJurusan");
        for (int i=0; i<mhs.length; i++){
            for (int j=0; j<mhs[i].length; j++){
                System.out.print(mhs[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
