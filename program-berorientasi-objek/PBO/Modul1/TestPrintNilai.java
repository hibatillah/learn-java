package PBO.Modul1;
import javax.swing.JOptionPane;
// percobaan9.3

public class TestPrintNilai {
    public static void main(String[] args) {
        int pilihan, nilai;
        String nama;

        PrintNilai obj = new PrintNilai();

        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihlah: "
            +"\n1. Jika ingin print nama"
            +"\n2. Jika ingin print bintang"));

        if (pilihan==1){
            nama = JOptionPane.showInputDialog("Masukkan sebuah nama: ");

            for (int i=0; i<5; i++){
                obj.printNama(nama);
            }
            System.out.println("");
        }
        else if (pilihan==2){
            nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan banyak tingkatan bintang: "));

            obj.bintang(nilai);
        }
        else {
            System.out.println("Masukan anda salah...");
        }


    }
    
}
