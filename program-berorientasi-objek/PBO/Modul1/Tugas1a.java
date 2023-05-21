package PBO.Modul1;
// tugas 1a

public class Tugas1a {
    //persegi
    public void luasPersegi(double sisi){
        double luas = sisi * sisi;
        System.out.println("luas persegi\t\t= "+ luas);
    }
    public void kelilingPersegi(double sisi){
        double keliling = sisi * 4;
        System.out.println("keliling persegi\t= "+ keliling);
    }

    //segitiga
    public void luasSegitiga(double sisi, double tinggi){
        double luas = sisi * tinggi / 2;
        System.out.println("luas segitiga\t\t= "+ luas);
    }
    public void kelilingSegitiga(double sisi){
        double keliling = sisi * 3;
        System.out.println("keliling segitiga\t= "+ keliling);
    }
    
    //lingkaran
    public void luasLingkaran(double jari){
        double luas = 3.14 * Math.pow(jari, 2);
        System.out.println("luas lingkaran\t\t= "+ luas);
    }
    public void kelilingLingkaran(double jari){
        double keliling = 3.14 * jari * 2;
        System.out.println("keliling lingkaran\t= "+ keliling);
    }
    
}
