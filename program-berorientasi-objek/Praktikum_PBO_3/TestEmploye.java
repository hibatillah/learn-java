package Praktikum_PBO_3;

public class TestEmploye{
    public static void main(String[] args) {
        int n = 3;
        int i;

        Employee emp = new Employee();

        for (i=0; i<n; i++){
            System.out.println("Masukkan Data Karyawan "+(i+1)+" : ");
            emp.getData();
            System.out.println();
        }
        
        System.out.println("Berikut Data Karyawan "+(i+1)+" : ");
        System.out.println("Id\tNama\tUmur\tGaji");
        for (i=0; i<n; i++){
            emp.putData();    
        }
    }
}