import javax.swing.JOptionPane;
public class Factorial_Rekursif {
    static int fak(int x){
        if (x == 0){
            return 1;
        } else{
            return x *fak(x -1);
        }
    }

    public static void main(String[] args) {
        int bil;
        bil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan yang akan difaktorialan"));
        JOptionPane.showMessageDialog(null, " " + bil + "! = " + fak(bil));

    }
}
