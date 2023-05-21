package Relasi;
public class TestPegawaiBank {
    public static void main(String[] args) {
        Pegawai P1 = new Pegawai("Dini", "1234");
        Pegawai P2 = new Pegawai("Budi", "1245");
        Bank B = new Bank("Mandiri");
        
        B.setPegawai(P1.getID(), P1.getNamaPegawai());
        B.setPegawai(P2.getID(), P2.getNamaPegawai());
            
        B.infoBank();
        B.dataPegawai();

    }
}
