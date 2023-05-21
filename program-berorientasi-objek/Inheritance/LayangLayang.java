package Inheritance;

public class LayangLayang extends BangunDatar{
    double diagonal1, diagonal2, sisiPanjang, sisiPendek, luas, keliling;

    public LayangLayang(double diagonal1, double diagonal2, double sisiPanjang, double sisiPendek){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiPanjang = sisiPanjang;
        this.sisiPendek = sisiPendek;
    }

    // luas layang
    @Override
    public double luas(){
        super.luas();
        luas = diagonal1 * diagonal2 / 2;
        return luas;
    }

    // keliling layang
    @Override
    public double keliling(){
        super.keliling();
        keliling = 2*(sisiPanjang + sisiPendek);
        return keliling;
    }
    
}
