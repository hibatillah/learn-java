package Praktikum_PBO_8;

public class Kucing extends Hewan {
    private String nama;
    
    Kucing(String nama){
        super("Kucing");
        this.nama = nama;
    }
    
    public void suara(){
        System.out.println("Mengeong.. ");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
    
}
