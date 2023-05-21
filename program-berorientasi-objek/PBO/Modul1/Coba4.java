package PBO.Modul1;

public class Coba4 {
    public void fullThrottle(){
       System.out.println("The car is going as fast as it can!");
   }
   public void speed(int maxSpeed){
       System.out.println("Max speed is : " + maxSpeed);
   }
   public void brand(String brand){
       System.out.println("My brand's car is "+brand);
   }
   public static void main(String[] args) {
       Coba4 myCar = new Coba4();
       myCar.fullThrottle();
       myCar.speed(200);
       myCar.brand("toyota");
   }
   
}
