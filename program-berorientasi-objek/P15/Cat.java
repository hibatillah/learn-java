package P15;

public class Cat extends Animal implements Pet{
    String nama;
    
    public Cat(String nama){
        super(5);
        this.nama = nama;
    }
    public Cat(){
        super(5);
        nama = null;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void play(){
        System.out.println(nama + " bermain mengejar cahaya atau bola");
    }
    
    public void eat(){
        System.out.println("Kucing  hewan karnivora");
    }
}
