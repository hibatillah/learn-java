package PBO.Modul2;

public class TesPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang ps1 = new PersegiPanjang();
        PersegiPanjang ps2 = new PersegiPanjang();
        PersegiPanjang pp1 = new PersegiPanjang();
        
        ps1.panjang = 4;
        ps1.lebar = 3;
        
        ps2.panjang = 6;
        ps2.lebar =  7;
        
        pp1.panjang = 4;
        pp1.lebar = 6;
        
        System.out.println("Persegi Panjang 1");
        System.out.println("Panjang : "+ ps1.panjang + " cm");
        System.out.println("Lebar : "+ps1.lebar + " cm");
        System.out.println("Luas persegi panjang 1 : "+ps1.luas() + " cm2");
        ps1.keliling();
        
        System.out.println("");
        
        System.out.println("Persegi Panjang 2");
        System.out.println("Panjang : "+ ps2.panjang + " cm");
        System.out.println("Lebar : "+ps2.lebar + " cm");
        System.out.println("Luas persegi panjang 22 : "+ps2.luas() + " cm2");
        ps2.keliling();
        
        System.out.println("");
        
        System.out.println("Persegi Panjang 3");
        System.out.println("Panjang : "+ pp1.panjang + " cm");
        System.out.println("Lebar : "+pp1.lebar + " cm");
        System.out.println("Luas persegi panjang 3 : "+pp1.luas() + " cm2");
        pp1.keliling();
    }
    
}
