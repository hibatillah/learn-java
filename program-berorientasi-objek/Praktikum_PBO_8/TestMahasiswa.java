package Praktikum_PBO_8;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa1 mh1 = new Mahasiswa1("habib");
        Mahasiswa2 mh2 = new Mahasiswa2("hasan");
        
        mh1.nilai();
        mh1.infoMahasiswa();
        System.out.println();
        mh2.nilai();
        mh2.infoMahasiswa();
    }
}
