package polimorfisme_tugas;
import javax.swing.JOptionPane;

public class PegawaiKontrak extends Pegawai {
    public int gajiTetap = 3000000;
    public int jam = 24;
    public int bonus = 50000;
    public int bonusLembur, project;
    public double bonusProject;

    @Override
    public void Jabatan(){
        System.out.println("Pegawai Tetap Perusahaan Yaitu Manager, "
            + " Kepala Bagian, dan Staff Bagian Pemasaran.");
    }

    @Override
    public void Gaji(){
        System.out.println("Total Gaji Pegawai Tetap Perusahan : Rp" + gajiTetap);
    }
    
    @Override
    public void BonusLembur(){
        bonusLembur = bonus * jam;
        System.out.println("Bonus Lembur : Rp" + bonusLembur);
    }
    
    public void BonusProject(){
        project = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Project : "));
        bonusProject = project + 0.02;
        System.out.println("Bonus Project : "+bonusProject);
    }
}
