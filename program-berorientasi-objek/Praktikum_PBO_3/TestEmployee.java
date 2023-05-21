package Praktikum_PBO_3;

public class TestEmployee {
    public static void main(String[] args) {
        int n = 3;
        int i;
    
        Employee emp[] = new Employee[n];
        for (i=0; i<n; i++){
            emp[i] = new Employee();
        }

        for (i=0; i<n; i++){
            System.out.println("Masukkan detail data Karyawan "+(i+1)+":");
            emp[i].getData();
            System.out.println();
        }

        System.out.println("Detail karyawan yang telah diinputkan: ");
        System.out.println("Id\tNama\tUmur\tGaji");
        for (i=0; i<n; i++){
            emp[i].putData();
        }
        
    }

    
}
