package latihan;

import javax.swing.JOptionPane;

public class Soal1 {
    public static void main(String[] args) {
        int n,i;
        int jumlah=0;
        int diatasrata=0;
        double rata;

        n = Integer.parseInt(JOptionPane.showInputDialog("Jumlah siswa: "));
        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] ket = new String[n];
        
        for (i=0; i<n; i++){
            nama[i] = JOptionPane.showInputDialog("Nama : ");
            String nilaiStr = JOptionPane.showInputDialog("Nilai : ");
            nilai [i] = Integer.parseInt(nilaiStr); 
            
            if (nilai[i]>60){
                ket[i] = "Lulus";
            } else {
                ket[i] = "Gagal";
            }
            jumlah += nilai[i];
        }
        
        System.out.println("Nama\tNilai\tStatus");
        for (i=0; i<n; i++){
            System.out.print(nama[i]+"\t"+nilai[i]+"\t"+ket[i]+"\n");
        }
        rata = jumlah/n;
        for (double total : nilai){
            if (total > rata){
                diatasrata++;
            }
        }
            
        System.out.println("Rata-rata kelas "+rata+"\n"+diatasrata+" siswa dengan nilai diatas rata-rata");
    }
    
}
