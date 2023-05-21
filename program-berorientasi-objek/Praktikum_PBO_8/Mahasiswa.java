package Praktikum_PBO_8;

public abstract class Mahasiswa {
    private String nama;
    
    Mahasiswa(String nama){
        this.nama = nama;
    }

    protected abstract void infoMahasiswa();
    protected abstract int nilaiMax();
    protected abstract int nilaiRata(); 
    
    public String nama(){
        return nama;
    }
}
