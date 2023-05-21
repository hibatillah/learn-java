package hibatillah_kuis1;
import javax.swing.JOptionPane;

public class Angka {
    int[] angka = new int[bil];
    String[] status = new String[bil];
    int jumlah = 0;
    static int bil;

    void banyakAngka(int bilangan){
        bil = bilangan;
        System.out.println("banyak angka yang diinputkan: "+bil);
        for (int i=0; i<bil; i++){
            angka[i] = Integer.parseInt(JOptionPane.showInputDialog("angka ke "+(i+1)+": "));
        }
    }

    void statusAngka(){
        for (int i=0; i<bil; i++){
            if (angka[i]%2==0){
                status[i] = "Genap";
            }
            else {
                status[i] = "Ganjil";
            }
            System.out.println(angka[i]+" merupakan angka "+status[i]);
        }
    }
    
    void jumlahAngka(){
        for (int i=0; i<bil; i++){
            jumlah += angka[i];
        }
        System.out.println("Jumlah angka: "+jumlah);
    }
    
    public static void main(String[] args) {
        bil = Integer.parseInt(JOptionPane.showInputDialog("banyak angka diinputkan: "));
        Angka obj = new Angka();

        obj.banyakAngka(bil);
        obj.statusAngka();
        obj.jumlahAngka();
    }
    
}
