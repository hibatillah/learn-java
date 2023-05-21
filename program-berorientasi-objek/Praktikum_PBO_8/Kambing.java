package Praktikum_PBO_8;

public class Kambing extends Hewan {
    private String nama; 

    Kambing(String nama){
        super("Kambing");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Mengembek");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
    
}
