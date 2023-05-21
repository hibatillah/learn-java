import javax.swing.JOptionPane;
public class Fibbonaci_Rekursif {
    public static void main(String[] args) {
        int angka = Integer.parseInt(JOptionPane.showInputDialog(("Masukkan Nilai: ")));
        int i;

        for (i = 1; i<=angka; i++){
            System.out.println(" " + Fibonacci(i));
        }
    }

    public static int Fibonacci(int angka){
        if(angka == 1 || angka == 2){
            return 1;
        } else {
            return Fibonacci(angka-2)+
                    Fibonacci(angka-1);
        }
    }
}
