package Relasi;

public class Dosen {
    private String kodeDosen;
    private String[] nimMhs = new String[5];
    private int jumlahMhs;

    public String getKodeDosen() {
        return kodeDosen;
    }
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public String getNimMhs(int indeks) {
        return nimMhs[indeks];
    }
    public void setNimMhs(String nimMhs) {
        if (jumlahMhs<this.nimMhs.length){
            this.nimMhs[jumlahMhs] = nimMhs;
            jumlahMhs++;
        }
    }

    public int getJumlahMhs() {
        return jumlahMhs;
    }
    public void setJumlahMhs(int jumlahMhs) {
        this.jumlahMhs = jumlahMhs;
    }
    
}
