package polimorfisme_tugas;

public class PegawaiTetap {
    public int gajiTetap = 5000000;
    public int tunjangan = 500000;
    public int jam = 24;
    public int bonus = 50000;
    public int bonusLembur;

    public void Jabatan(){
        System.out.println("Pegawai Tetap Perusahaan ada Manager, "
            + " Kepala Bagian dan Staff Bagian Pemasaran.");
    }

    public void Gaji(){
        System.out.println("Total Gaji Pegawai Tetap Perusahan : Rp" + gajiTetap);
    }
    
    public void tunjangan(){
        System.out.println("Total Tunjangan : Rp" + tunjangan);
    }
    public void bonusLembur(){
        bonusLembur = bonus * jam;
        System.out.println("Bonus Lembur : Rp" + bonusLembur);
    }
}
