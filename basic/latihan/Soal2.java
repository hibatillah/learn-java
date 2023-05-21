package latihan;

import javax.swing.JOptionPane;

public class Soal2 {
    public static void main(String[] args) {
        int i, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Mahasiswa : "));
        
        String nama [] =  new String [n];
        int nilai [] = new int [n];
        int min = nilai[0];
        int max = nilai[0];
        String namamax = null;
        String namamin = null;
            
        for (i = 0; i<n;i++) {
            nama[i] = JOptionPane.showInputDialog("Nama : ");
            String nilaiStr = JOptionPane.showInputDialog("Nilai : ");
            nilai [i] = Integer.parseInt(nilaiStr);   
                
            if(i==0){
                min = nilai[i];
                namamin = nama[i];
                max = nilai[i];
                namamax = nama[i];
            }else if(nilai[i] > max){
                max = nilai[i];
                namamax = nama[i];
            }else if(nilai[i] < min){
                min = nilai[i];
                namamin = nama[i];
            }
        }
            
        System.out.println("Nama   \tNilai ");
        
        for (i=0; i<n;i++) {
            System.out.println(nama[i]+"\t"+nilai[i]);    
        }
            
        System.out.println("Nilai tertinggi a.n "+namamax+", dengan nilai :  "+max);
        System.out.println("Nilai tertinggi a.n "+namamin+", dengan nilai :  "+min);
    }

}
