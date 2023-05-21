package Array;

import javax.swing.JOptionPane;

public class terbalik {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("jumlah: "));
        String bintang[][] = new String[n][n];
        String tanda = "*";
        
        for (int i=0; i<bintang.length; i++){
            for (int j=0; j<bintang[i].length; j++){
                if ((n-i)>=(j+1)){
                    bintang[i][j] = tanda;
                } else {
                    bintang[i][j] = " ";
                }
            }
        }
        for (int i=0; i<bintang.length; i++){
            for (int j=0; j<bintang[i].length; j++){
                System.out.print(bintang[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
