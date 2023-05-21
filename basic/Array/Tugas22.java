package Array;

import javax.swing.JOptionPane;

public class Tugas22 {
    public static void main(String[] args) {
        int bil[] = new int[5];
        double jumlah=0, rata=0;
        int atasrata=0;
        
        for (int i=0; i<bil.length; i++){
            bil[i] = Integer.parseInt(JOptionPane.showInputDialog("input bil ke "+(i+1)+" :"));
            jumlah += bil[i];
            System.out.println(bil[i]);
        }
        rata = jumlah/bil.length;
        System.out.println("Rata-rata bilangan "+rata);
        
        for (int i=0; i<bil.length; i++){
            if (bil[i]>rata){
                atasrata += 1;
            } else {
                atasrata += 0;
            }
        }
        System.out.println("Ada "+atasrata+" bilangan diatas rata-rata");
    }
    
}
