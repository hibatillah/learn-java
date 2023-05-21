package Example.loop;

import javax.swing.JOptionPane;

public class loopganjilgenap {
    public static void main(String[] args) {
        int bil, i;
        String ket;

        for (i=1;i<=5;i++){
            bil = Integer.parseInt(JOptionPane.showInputDialog("Bilangan ke "+i));

            if (bil%2 == 0){
                ket = "Genap";
            } else{
                ket = "Ganjil";
            }

            System.out.println();
        }
    }
    
}
