package ControlStatement;

import java.util.Scanner;

public class Looping02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i;

        System.out.println("nilai i:");
        i = input.nextInt();
        
        do {
            System.out.println("Belajar java");
            i++;
        } while(i<10);
    }
    
}
