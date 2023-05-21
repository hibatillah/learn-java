package PBO.Modul2;
import java.util.Scanner;

public class TestOrang {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Orang budi = new Orang();
        Orang gina = new Orang("Gina", "Jl. Rumbai", 30);

        System.out.println("Masukkan nama: ");
        budi.nama = obj.next();
        System.out.println("Masukkan alamat: ");
        budi.alamat = obj.nextLine();
        System.out.println("Masukkan umur: ");
        budi.umur = obj.nextInt();

        System.out.println();
        System.out.println("Data "+budi.nama);
        budi.info();

        System.out.println();
        System.out.println("Data "+gina.nama);
        gina.info();
    }
    
}
