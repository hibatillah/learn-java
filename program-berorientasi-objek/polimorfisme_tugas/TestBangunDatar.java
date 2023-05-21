package polimorfisme_tugas;

public class TestBangunDatar {
     public static void main(String[] args) {
        Persegi P = new Persegi(4);
        Lingkaran L = new Lingkaran(3);
        Segitiga S = new Segitiga(2, 5, 3);
        
        System.out.println("Luas Persegi: " + P.luas());
        System.out.println("Keliling Persegi: " + P.keliling()); 
        System.out.println();
        
        System.out.println("Luas Lingkaran: " + L.luas());
        System.out.println("Keliling Lingkaran: " + L.keliling());
        System.out.println();

        System.out.println("Luas Segitiga: " + S.luas());
        System.out.println("Keliling Segitiga: " + S.keliling());
        
        
    }
}
