package Array;

import javax.swing.JOptionPane;

public class tiga {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Jumlah: "));
        String bintang[][] = new String[n][n];
        String tanda = "*";
        
        for (int i=(n-1); i>0; i--){
            for (int j=0; j<bintang[i].length; j++){
                if (i==(n-1)){
                    bintang[i][j] = tanda;
                }
                else {
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
