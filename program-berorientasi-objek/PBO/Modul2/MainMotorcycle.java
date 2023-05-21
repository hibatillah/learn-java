package PBO.Modul2;

public class MainMotorcycle {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        
        m.make = "Yamaha RZ 350";
        m.color = "yellow";
        
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("------");
        
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("------");
        
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("------");
        
        System.out.println("Starting engine...");
        m.startEngine();
        
    }
}
