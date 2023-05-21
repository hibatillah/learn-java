package Example.IfElse;

import java.util.Scanner;

public class bubur {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int anda, jawab;
        String kamu;

        System.out.println("Apakah anda suka bubur..?\n1. ya\n2. tidak");
        anda = input.nextInt();
        
        if (anda == 1){
            System.out.println("anda suka bubur diaduk atau tidak diaduk..?\n1. diaduk\n2. tidak diaduk");
            jawab = input.nextInt();
            if (jawab == 1){
                System.out.println("waah..! kita sama");
            } else if (jawab == 2){
                System.out.println("oh oke. kita berbeda..");
            } else{
                System.out.println("tidak valid");
            }
        } else if (anda == 2){
            System.out.println("Cobain lagi deh kapan-kapan, sehat dan bergizi, siapa tahu jadi suka");
            kamu = input.next();
            if (kamu == "oke"){
                System.out.println("oke");
            } else{
                System.out.println("oh oke");
            }
        } else{
            System.out.println("pernyataan tidak valid");
        }
    }
    
}