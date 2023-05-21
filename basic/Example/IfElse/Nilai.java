package Example.IfElse;

import javax.swing.JOptionPane;

public class Nilai {
    public static void main(String[] args) {
        int bilangan;
        String ket;

        bilangan = Integer.parseInt(JOptionPane.showInputDialog("input bilangan: "));

        if(bilangan>=1){
            if(bilangan>=1 && bilangan<=3){
                ket = "bawah";
            } else if(bilangan>=4 && bilangan<=7){
                ket = "tengah";
            } else if(bilangan>=8 && bilangan<=10){
                ket = "atas";
            } else{
                ket = "tidak valid";
            }
        } else {
            ket = "tidak valid";
        }
        if(ket == "tidak valid"){
            System.out.println("kode tidak valid");
        } else{
            System.out.println(bilangan+" adalah bilangan "+ket);
        }
        
    }
    
}
