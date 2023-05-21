package Array;

import javax.swing.JOptionPane;

public class Tugas21 {
    public static void main(String[] args) {
        int bil[] = new int[10];
        String ket;
        
        for (int i=0; i<bil.length; i++){
            bil[i] = Integer.parseInt(JOptionPane.showInputDialog("input bil ke "+(i+1)+" :"));
            
            if (bil[i]%2==0){
                ket = "Genap";
            } else {
                ket = "Ganjil";
            }
            System.out.println(bil[i]+" adalah bilangan "+ket);
        }
    }
    
}
