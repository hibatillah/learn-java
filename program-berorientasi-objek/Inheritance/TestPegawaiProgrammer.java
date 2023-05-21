package Inheritance;

public class TestPegawaiProgrammer {
    public static void main(String[] args) {
        Programmer PG = new Programmer();

        PG.nama = "Programmer";
        PG.infoPegawai();
        System.out.println();

        PG.aturanWajib();
        System.out.println();
        
        PG.aturanProgrammer();
        System.out.println();
        
        PG.totalGaji();
        System.out.println();
    }
}
