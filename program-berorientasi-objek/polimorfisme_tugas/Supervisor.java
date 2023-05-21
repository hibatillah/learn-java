package polimorfisme_tugas;

public class Supervisor extends Karyawan {
    public String nama;
    public int gajiLembur, gajiPokok, totalGaji, totalGajiPokok, totalGajiLembur, kerja, lembur;
    
    public Supervisor(int gajiLembur, int gajiPokok){
        System.out.println("Ini adalah class Supervisor");
        super.karyawan();
        this.nama = "Supervisor";
        this.gajiLembur = gajiLembur;
        this.gajiPokok = gajiPokok;
    }
    
    public Supervisor(){
        System.out.println("Ini adalah class Supervisor");
        super.karyawan();
        nama = "Supervisor";
        gajiPokok = 46000;
        gajiLembur = 20000;
    }

    @Override   //aturan wajib
    public String Wajib(){
        super.Wajib();
        System.out.println(nama + " datang tepat waktu\n" + nama +" mengisi absensi");   
        return null;
    }

    @Override   //aturan khusus
    public String Khusus() {
        super.Khusus();
        System.out.println(nama + " melakukan kontrol kinerja karyawan");
        return null; 
    }
    
    public void jamKerja(int kerja, int lembur){
        this.kerja = kerja;
        this.lembur = lembur;
        System.out.println("Jam kerja sebanyak " + kerja + " jam\nJam lembur " + lembur + " jam");
    }

    //hitung gaji
    public void Gaji(){
        totalGajiPokok = kerja * gajiPokok;
        totalGajiLembur = lembur * gajiLembur;
        totalGaji = totalGajiPokok + totalGajiLembur;
        System.out.println("Gaji pokok " + nama + " adalah Rp" + totalGajiPokok
            + "\nBonus gaji adalah Rp" + totalGajiLembur
            + "\nTogal gaji Rp" + totalGaji);
    }
    
}
