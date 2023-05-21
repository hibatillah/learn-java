package Example.IfElse;

import java.util.Scanner;

public class kabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tahun;

        System.out.println("input tahun: ");
        tahun = input.nextInt();

        if (tahun % 4 == 0){
            System.out.println(tahun+" merupakan tahun kabisat");
        } else {
            System.out.println(tahun+" bukan tahun kabisat");
        }
        
    }
    
}
