package Array;

import javax.swing.JOptionPane;

public class ContohArray1 {
    public static void main(String[] args) {
        String nama[] = new String[5];
        double ipk[] = new double[5];
        String status;
        double jumlah=0;
        double rata=0;
        String namamax, namamin;
        double max, min;
        namamax = null;
        namamin = null;
        max = ipk[0];
        min = ipk[0];

        System.out.println("Index\tNama\tIPK\tStatus");
        for (int i=0; i<nama.length; i++){
            nama[i] = JOptionPane.showInputDialog("Nama: ");
            ipk[i] = Double.parseDouble(JOptionPane.showInputDialog("IPK : "));

            if (i==0){
                max = ipk[i];
                min = ipk[i];
                namamax = nama[i];
                namamin = nama[i];
            } else if (ipk[i]>max){
                max = ipk[i];
                namamax = nama[i];
            } else if (ipk[i]<min){
                min = ipk[i];
                namamin = nama[i];
            }

            if (ipk[i]>3.5){
                status = "Cumlaude";
            } else {
                status = "-";
            }
            jumlah += ipk[i];
            System.out.println(i+"\t"+nama[i]+"\t"+ipk[i]+"\t"+status);
        }
        rata = jumlah/ipk.length;

        System.out.println("Rata-rata IPK : "+rata);
        System.out.println("IPK tertinggi "+max+" oleh "+namamax+"\nIPK terendah "+min+" oleh "+namamin);

    }
    
}
