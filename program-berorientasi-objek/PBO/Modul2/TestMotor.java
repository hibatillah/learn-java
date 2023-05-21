package PBO.Modul2;

public class TestMotor {
    public static void main(String[] args) {
        Motor m1 = new Motor("Vario","Matic");
        Motor m2 = new Motor(2015, 5000000.25);
        Motor m3 = new Motor(65);
        Motor m4 = new Motor("merah");
        
        System.out.println("Nama motor  : "+ m1.nama);
        System.out.println("Jenis motor : "+ m1.jenis);
        System.out.println("Tahun rilis : "+ m2.tahun);
        System.out.println("Harga motor : "+ m2.harga);
        System.out.println("Harga motor setelah diskon : "+m2.hargaMotor());
        System.out.println("Kecepatan rata-rata motor : "+m3.kecepatanMotor());
        m4.warnaMotor();
    }
    
}
