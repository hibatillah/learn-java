package Praktikum_PBO_8;

public abstract class Hewan {
    private String jenis;

    Hewan(String jenis){
        this.jenis = jenis;
    }

    protected abstract void suara();    //dideklarasikan tapi tak didefenisikan

    public String toString(){
        return "Seekor " + jenis;
    }
    
}
