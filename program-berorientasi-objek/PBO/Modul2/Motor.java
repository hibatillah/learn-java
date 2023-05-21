package PBO.Modul2;

public class Motor {
    String nama, jenis, warna;
    double harga, kec, diskon, total;
    int tahun;
    
    Motor(String namamotor, String jenismotor){
        nama = namamotor;
        jenis = jenismotor;
    }
    
    Motor(int tahunrilis, double hargamotor){
        tahun = tahunrilis;
        harga = hargamotor;
    }
    
    Motor(double kecepatan){
        kec = kecepatan;
    }

    Motor(String wrn){
        warna = wrn;
    }

    double hargaMotor(){
        diskon = harga*0.1;
        total = harga - diskon;
        return total;
    }

    String kecepatanMotor(){
        String kecmotor = kec + "km/jam";
        return kecmotor;
    }

    void warnaMotor(){
        System.out.println("Warna motor yang dibeli adalah warna "+warna);
    }
    
}
