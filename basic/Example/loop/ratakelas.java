package Example.loop;

import javax.swing.JOptionPane;

public class ratakelas {
    public static void main(String[] args) {
        String nama, kelas, ket;
        double uts, uas, rata=0, total, nilai;
        int jumlah, i=1;;
        
        kelas = JOptionPane.showInputDialog("Kelas: ");
        jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumla siswa: "));
        
        if (jumlah >= 1){
            do{
                nama = JOptionPane.showInputDialog("Nama anda: ");
                uts = Double.parseDouble(JOptionPane.showInputDialog("Nilai UTS: "));
                uas = Double.parseDouble(JOptionPane.showInputDialog("Nilai UAS: "));
                nilai = (uts+uas)/2;
                rata += nilai;
                
                if (nilai >= 1 && nilai <= 100){
                    if (nilai >= 90){
                        ket = "Sempurna";
                    } else if (nilai >= 80){
                        ket = "Bagus";
                    } else if (nilai >= 70){
                        ket = "Baik";
                    } else if (nilai >= 60){
                        ket = "Cukup";
                    } else if (nilai >= 50){
                        ket = "Kurang";
                    } else if (nilai >= 40){
                        ket = "Buruk";
                    } else{
                        ket = "Gagal";
                    }
                } else{
                    System.out.println("Nilai tidak valid");
                    ket = "tidak valid";
                }
                System.out.println("Nama\t: "+nama+"\nKelas\t: "+kelas+"\nNilai\t: "+nilai+"\nNilai anda "+ket+"\n");
                i++;
            }
            while (i <= jumlah);
        } else{
            System.out.println("Jumlah siswa tidak valid");
        }
        rata = rata/jumlah;
        System.out.println("Kelas\t\t: "+kelas+"\nJumlah siswa\t: "+jumlah+"\nRata-rata kelas\t: "+jumlah);
        
    }
    
}
