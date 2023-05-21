package polimorfisme_tugas;

public class TestPegawai {
    public static void main(String[] args) {
        PegawaiTetap PT = new PegawaiTetap();
        PegawaiKontrak PK = new PegawaiKontrak();

        PT.Jabatan();
        PT.Gaji();
        PT.tunjangan();
        PT.bonusLembur();

        System.out.println();

        PK.Jabatan();
        PK.Gaji();
        PK.BonusLembur();
        PK.BonusProject();
    }
    
}
