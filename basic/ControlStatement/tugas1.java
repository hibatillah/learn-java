package ControlStatement;

import javax.swing.JOptionPane;

public class tugas1 {
    public static void main(String[] args) {
        int i = 1;
        
        do {
            int bil = Integer.parseInt(JOptionPane.showInputDialog("input bilangan ke "+i+" : "));
            if (bil%2==0){
                System.out.println(bil+" adalah bilangan genap");
            } else{
                System.out.println(bil+" adalah bilangan ganjil");
            }
            i++;
        }
        while (i<=5);
       
    
    }
    
}
