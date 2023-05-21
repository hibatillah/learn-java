package Example.loop;

import java.util.Scanner;

public class JumlahGanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bil, genap=0, ganjil=0;
        int i = 1;

        while (i<=5){
            System.out.println("bilangan ke "+i+" : ");
            bil = sc.nextInt();
            
            if (bil%2==0){
                genap = genap + 1;
            } else{
                ganjil = ganjil + 1;
            }
            i++;
        }

        System.out.println("Jumlah genap: "+genap);
        System.out.println("Jumlah ganjil: "+ganjil);
        
    }
    
}
