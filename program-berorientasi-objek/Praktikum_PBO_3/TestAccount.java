package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class TestAccount {
    public static void main(String[] args) {
        int n = 5;
        int i;

        Account acc[] = new Account[n];

        for (i=0; i<n; i++){
            acc[i] = new Account();
        }

        for (i=0; i<n; i++){
            JOptionPane.showMessageDialog(null, "input ke "+(i+1)+": ");
            int a = Integer.parseInt(JOptionPane.showInputDialog("input nilai a: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("input nilai b: "));
            acc[i].setNewData(a, b);
        }
        
        for (i=0; i<n; i++){
            System.out.println("Nilai Atribut pada object "+(i+1)+" : ");
            acc[i].showData();
        }

    }

}