package PBO.Modul1;
// percobaan 9.1

public class PrintNilai {
    public void printNama(String nama){
        System.out.println(nama);
    }

    public void bintang(int nilai){
        for (int i=1; i<=nilai; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
