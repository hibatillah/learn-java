package Praktikum_PBO_8;

public class Anjing extends Hewan {
    private String nama;

    Anjing(String nama){
        super("Idul");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("Menggonggong");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
    
}
