package PBO.Modul2;

public class TestTabung {
    public static void main(String[] args) {
        Tabung obj1 = new Tabung();
        Tabung obj2 = new Tabung(4, 6);
        Tabung obj3 = new Tabung(obj1);
        
        System.out.println();
        System.out.println("Jari-jari permukaan alas tabung : "+obj2.jari);        
        System.out.println("Tinggi tabung : "+obj2.tinggi);     
        System.out.println("Luas permukaan tabung = "+ obj2.luaspermukaanTabung()); 
        System.out.println("Volume tabung = "+ obj2.volumeTabung());
        
        System.out.println();
    }
    
}
