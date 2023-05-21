package komposisi;

public class Dosen {
    private String kode;
    private Mahasiswa mahasiswa;
    private Kelas kelas;

    public Dosen(String kode) {
        this.kode = kode;
    }

    public void Mahasiswa(Mahasiswa mahasiswa, Kelas kelas){
        this.mahasiswa = mahasiswa;
        this.kelas = kelas;
    }

    public void infoDosen(){
        System.out.println("Dosen kode " + kode + " mengajar mahasiswa NIM "
            + mahasiswa.getNim() + " dari kelas " + kelas.getNama());
    }
}
