package PBO.Modul1;
import java.util.Scanner;
// percobaan 8.2

public class ClassSatu2 {
    public static void main(String[] args) {
        double result1, result2, result3, result4;
        ClassSatu1 obj = new ClassSatu1();

        result1 = obj.tambah(10, 4);
        result2 = obj.kurang(10, 4);
        result3 = obj.kali(10, 4);
        result4 = obj.bagi(10, 4);

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sebuah kata: ");
        String txt = input.nextLine();

        System.out.println("Hasil tambah "+result1);
        System.out.println("Hasil kurang "+result2);
        System.out.println("Hasil kali "+result3);
        System.out.println("Hasil bagi "+result4);

        obj.cetak(txt);
    }
    
}
