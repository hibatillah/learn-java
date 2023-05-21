package PBO.Modul1;
import javax.swing.JOptionPane;
//tugas 3b main class

public class Tugas3b {
    public static void main(String[] args) {
        Tugas2a huruf = new Tugas2a();
        Tugas3a data = new Tugas3a();

        int jumlahSiswa, jumlahGuru;
        jumlahSiswa = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Siswa: "));
        jumlahGuru = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Guru: "));
        String siswaNama[] = new String[jumlahSiswa];
        String siswaKelas[] = new String[jumlahSiswa];
        double tugas[] = new double[jumlahSiswa];
        double uts[] = new double[jumlahSiswa];
        double uas[] = new double[jumlahSiswa];
        String guru[] = new String[jumlahGuru];
        String mapel[] = new String[jumlahGuru];

        System.out.println("Berikut data Siswa SMA\n---------------");
        for (int i=0; i<siswaNama.length; i++){
            siswaNama[i] = JOptionPane.showInputDialog("Nama siswa "+(i+1)+": ");
            siswaKelas[i] = JOptionPane.showInputDialog("Kelas "+siswaNama[i]+": ");
            tugas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nilai Tugas "+siswaNama[i]+": "));
            uts[i] = Double.parseDouble(JOptionPane.showInputDialog("Nilai UTS "+siswaNama[i]+": "));
            uas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nilai UAS "+siswaNama[i]+": "));
            
            data.siswa(siswaNama[i], siswaKelas[i]);
            System.out.println("Dengan nilai akhir "+data.nilaiAkhir(tugas[i], uts[i], uas[i]));
            huruf.grade(data.nilaiAkhir(tugas[i], uts[i], uas[i]));
            System.out.println("\n");
        }
        
        System.out.println("Berikut data Guru SMA\n---------------");
        for (int i=0; i<guru.length; i++){
            guru[i] = JOptionPane.showInputDialog("Nama guru "+(i+1)+": ");
            mapel[i] = JOptionPane.showInputDialog("Mapel yang diampu guru "+guru[i]+": ");

            data.guru(guru[i], mapel[i]);
        }

    }
    
}
