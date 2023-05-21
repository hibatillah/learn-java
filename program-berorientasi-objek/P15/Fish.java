package P15;

public class Fish extends Animal implements Pet{
    String nama;
    
    public Fish(){
        super(0);
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void play(){
        System.out.println("Ikan berada di air");
    }
    
    public void walk(){
        super.walk();
        System.out.println("Ikan berenang");
    }
    
    public void eat(){
        System.out.println("Ikan hewan omnivora");
    }
}
