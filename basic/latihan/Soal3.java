package latihan;

import javax.swing.JOptionPane;

public class Soal3 {
    public static void main(String[] args) {
        String[] jawab = new String[5];
        String[] kunci = {"b","b","s","s","b"};
        int benar = 0;
        int nilai, i;

        for (i=0; i< jawab.length; i++){
            jawab[i] = JOptionPane.showInputDialog("Jawaban ke "+(i + 1));

            if (jawab[i].equals(kunci[i])){
                benar++;
            }
        }
        nilai = (int) (((double) benar / jawab.length)* 100);
        System.out.print("Jawaban: ");

        for (i=0; i<jawab.length; i++){
            System.out.print(jawab[i] + " ");
        }
        System.out.println("\nNilai: "+nilai);
    }
    
}
