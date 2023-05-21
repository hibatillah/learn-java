package PBO.Modul2;

public class Burung {
    String nama, jenis, warna, asal;

    Burung(){
        nama = "beo";
    }

    Burung(String namaburung, String jenisburung, String warnaburung){
        nama = namaburung;
        jenis = jenisburung;
        warna = warnaburung;
    }

    Burung(String jenisburung, String asalburung){
        System.out.println("Burung dengan jenis "+jenisburung+" berasal dari daerah "+asalburung);
    }

    public int jumlahBurung(int ekorburung){
        int jumlah = ekorburung;
        return jumlah;
    }
}
