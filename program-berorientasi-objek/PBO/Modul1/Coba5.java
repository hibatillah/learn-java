package PBO.Modul1;

public class Coba5 {
    int tambah(){
        int num1 = 10;
        int num2 = 20;
        int hasilTambah = num1 + num2;
        return hasilTambah;
    }

    int kurang(){
        int num1 = 10;
        int num2 = 5;
        int hasilKurang = num1 - num2;
        return hasilKurang;
    }

    int kali(){
        int num1 = 10;
        int num2 = 2;
        int hasilKali = num1 * num2;
        return hasilKali;
    }

    String nama(){
        return "habib";
    }
    public static void main(String[] args) {
        Coba5 obj1 = new Coba5();
        System.out.println("Hasil tambah: "+obj1.tambah());
        System.out.println("Hasil kurang: "+obj1.kurang());
        System.out.println("Hasil kali: "+obj1.kali());
        System.out.println("Nama saya "+obj1.nama());
        
    }
    
}
