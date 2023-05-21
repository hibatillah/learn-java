package PBO.Modul2;

public class TestMajalah {
    public static void main(String[] args) {
        Majalah m1 = new Majalah();
        Majalah m2 = new Majalah();
        
        m1.nama = "Tempo";
        m2.nama = "Aneka Yes";
        
        m1.info();
        m1.Spesialisasi("sport");
        
        m2.info();
        m2.Spesialisasi("kuliner");
    }
    
}
