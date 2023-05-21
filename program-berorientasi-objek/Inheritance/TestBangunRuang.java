package Inheritance;

public class TestBangunRuang {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Limas limas = new Limas();
        Tabung tabung = new Tabung();
        Balok balok = new Balok();
        Bola bola = new Bola();
        
        kubus.nama = "Kubus";
        kubus.sisi = 12;
        System.out.println("Nama Bangun Ruang : "+kubus.nama);
        System.out.println("Luas Kubus : "+kubus.Luas());
        System.out.println("Volume Kubus V "+kubus.Volume());
        System.out.println();
        
        limas.nama = "Limas Segiempat";
        limas.alas = limas.sisi = 7;
        limas.tinggi = 9;
        limas.tinggiLimas = 12;
        System.out.println("Nama Bangun Ruang : "+limas.nama);
        System.out.println("Luas Limas : "+limas.Luas());
        System.out.println("Volume Limas V "+limas.Volume());
        System.out.println();
        
        tabung.nama = "Tabung";
        tabung.jarijari = 21;
        tabung.phi = 3.14;
        tabung.tinggi = 14;
        System.out.println("Nama Bangun Ruang : "+tabung.nama);
        System.out.println("Luas Permukaan Tabung : "+tabung.Luas());
        System.out.println("Volume Tabung : "+tabung.Volume());
        System.out.println();
        
        balok.nama = "Balok";
        balok.panjang = 7;
        balok.lebar = 8;
        balok.tinggi = 11;
        System.out.println("Nama Bangun Ruang : "+balok.nama);
        System.out.println("Luas Permukaan Balok : "+balok.Luas());
        System.out.println("Volume Balok : "+balok.Volume());
        System.out.println();
        
        bola.nama = "Bola";
        bola.phi = 3.14;
        bola.jarijari = 7;
        System.out.println("Nama Bangun Ruang : "+bola.nama);
        System.out.println("Luas Permukaan Bola : "+bola.Luas());
        System.out.println("Volume Bola : "+bola.Volume());
        System.out.println();
    }
}
