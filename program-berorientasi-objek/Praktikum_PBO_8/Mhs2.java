package Praktikum_PBO_8;

public class Mhs2 extends Mahasiswa {
    private double mk1, mk2, mk3, mk4;
    private double rata;

    Mhs2(double mk1, double mk2, double mk3, double mk4){
        super("Ilham");
        this.mk1 = mk1;
        this.mk2 = mk2;
        this.mk3 = mk3;
        this.mk4 = mk4;
    }

    private double[] nilai = {mk1, mk2, mk3, mk4};
    double max = nilai[0];

    public double nilaiTertinggi(){
        //mencari nilai maximum
        for (int i=0; i<nilai.length; i++) {
            if (nilai[i]>max){
                max = nilai[i];
            }
        }
        return max;
    }

    public double nilaiRata(){
        rata = (mk1 + mk2 + mk3 + mk4) /4;
        return rata;
    }
    
}
