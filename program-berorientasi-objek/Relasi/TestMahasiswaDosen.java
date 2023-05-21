package Relasi;

public class TestMahasiswaDosen {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa();
        M1.setNim("2157301023");
        M1.setNama("Dini");
        
        Mahasiswa M2 = new Mahasiswa();
        M2.setNim("2157301043");
        M2.setNama("Budi");

        Dosen D = new Dosen();
        D.setKodeDosen("ASL");

        D.setNimMhs(M1.getNim());
        D.setNimMhs(M2.getNim());

        System.out.println("Kode Dosen : " + D.getKodeDosen() 
            + "\nJumlah Mahasiswa : " + D.getJumlahMhs());
        for (int i=0; i<2; i++){
            System.out.println("Nim Mahasiswa " + D.getNimMhs(i));
        }
    }
}
