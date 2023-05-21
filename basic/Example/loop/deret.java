package Example.loop;

import javax.swing.JOptionPane;

public class deret {
    public static void main(String[] args) {
        int i=1, n, jumlah=0;
        n = Integer.parseInt(JOptionPane.showInputDialog("nilai n: "));

        do{
            jumlah += i;
            i++;
        }
        while(i<=n);
        System.out.println("n : "+n+"\ntotal : "+jumlah);
    }
    
}
