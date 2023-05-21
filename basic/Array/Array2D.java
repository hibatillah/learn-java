package Array;

import javax.swing.JOptionPane;

public class Array2D {
    public static void main(String[] args) {
        String mhs[][] = new String[3][3];
        
        for (int i=0; i<mhs.length; i++){
            for (int j=0; j<mhs[i].length; j++){
                if (j==0){
                    JOptionPane.showMessageDialog(null, "Mahasiswa ke "+(i+1));
                }
                if (j==0){
                    mhs[i][j] = JOptionPane.showInputDialog("Nama");
                }
                else if (j==1){
                    mhs[i][j] = JOptionPane.showInputDialog("Prodi");
                }
                else if (j==2){
                    mhs[i][j] = JOptionPane.showInputDialog("Jurusan");
                }
            }
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
