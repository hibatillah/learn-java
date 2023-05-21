package PBO.Modul2;

public class PersegiPanjang {
    double panjang;
    double lebar;
    
    double luas(){
        double ls;
        ls = panjang * lebar;
        return ls;
    }
    
    void keliling(){
        double kll;
        kll = (2*panjang) + (2*lebar);
        System.out.println("Keliling persegi panjang : "+kll);
    }
    
}
