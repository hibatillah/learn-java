package Inheritance;

public class Programmer extends Pegawai {
    String nama;
    int gajiTambah, gajiPokok;
    
    public Programmer(String nama, int gajiTambah, int gajiPokok){
        this.nama = nama;
        this.gajiTambah = gajiTambah;
        this.gajiPokok = gajiPokok;
    }

    public Programmer(){
        gajiPokok = 5000000;
        gajiTambah = 2000000;
    }

    public void aturanWajib(){
        System.out.println("ATURAN WAJIB \n" + nama +" datang tepat waktu\n" 
            + nama +" mengisi absens \n" + nama +" melakukan meeting mingguan\n"
            + "Gaji Pokok " + nama +" sebanyak Rp" + gajiPokok);
    }

    public void aturanProgrammer(){
        System.out.println("ATURAN KHUSUS \n" + nama +" monitoring sistem perusahaan\n"
            + nama +" melayani error complain\n" 
            + "Bonus gaji "+ nama + " sebanyak Rp" + gajiTambah);
    }

    public void totalGaji(){
        int total = gajiPokok + gajiTambah;
        System.out.println("Total Gaji " + nama + " : Rp" + total);
    }

    @Override
    public String infoPegawai(){
        super.infoPegawai();
        return null;
    }     
}
