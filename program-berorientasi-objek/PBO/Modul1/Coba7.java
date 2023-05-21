package PBO.Modul1;

public class Coba7 {
    String siswa(String nama, int angkatan){
        return "Nama saya "+nama+", dari G"+angkatan;
    }

    public static void main(String[] args) {
        Coba7 data = new Coba7();
        System.out.println(data.siswa("habib", 21));
    }
    
}
