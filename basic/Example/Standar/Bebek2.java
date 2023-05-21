package Example.Standar;

import javax.swing.JOptionPane;

public class Bebek2 {
    public static void main(String[] args) {
        int bebek;
        int kawan;
        int hasil;
        int sisa;
        
        bebek = Integer.parseInt(JOptionPane.showInputDialog("Jumlah bebek: "));
        kawan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah kawan: " ));
        sisa = bebek%kawan;
        
        JOptionPane.showMessageDialog(null, "Jumlah bebek: "+bebek+
                "\nJumlah kawan: "+kawan+"\nSisa bebek: "+sisa);
        
    }
    
}
