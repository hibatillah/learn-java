package Inheritance;

public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga();

        s1.nama = "Siku-siku";
        s1.alas = 10;
        s1.tinggi = 15;

        System.out.println("Nama Segitiga: "+s1.nama);
        System.out.println("Luas Segitiga: "+s1.luas());
        
        System.out.println("");
        
        s2.nama = "Sama sisi";
        s2.sisi1 = s2.sisi2 = s2.sisi3 = 100;
        
        System.out.println("Nama Segitiga: "+s2.nama);
        System.out.println("Keliling Segitiga: "+s2.keliling());

        System.out.println();
        System.out.println("============");
        System.out.println();

        // Tugas 1
        Persegi p1 = new Persegi(5);
        System.out.println("Luas persegi: "+p1.luas());
        System.out.println("keliling persegi: "+p1.keliling());
        System.out.println();
        
        LayangLayang Ly1 = new LayangLayang(5, 6, 4, 2);
        System.out.println("Luas Layang-layang: "+Ly1.luas());
        System.out.println("keliling Layang-layang: "+Ly1.keliling());
        System.out.println();
        
        Trapesium t1 = new Trapesium(5, 7, 5, 4, 5);
        System.out.println("Luas Trapesium: "+t1.luas());
        System.out.println("keliling Trapesium: "+t1.keliling());
        System.out.println();
        
        Jajargenjang j1 = new Jajargenjang(5, 4, 6, 7);
        System.out.println("Luas Jajargenjang: "+j1.luas());
        System.out.println("keliling Jajargenjang: "+j1.keliling());
        System.out.println();
        
        Lingkaran Ling1 = new Lingkaran(6);
        System.out.println("Luas Lingkaran: "+Ling1.luas());
        System.out.println("keliling Lingkaran: "+Ling1.keliling());
        System.out.println();
    }
    
}
