package Array;

// ascending <
public class Tugas25 {
    public static void main(String[] args) {
        int bil[] = {5,3,1,6,7};
        int tampung=0;
        int i,j;

        System.out.print("Sebelum diurutkan = ");
        for (i=0; i<bil.length; i++){
            System.out.print(bil[i]+",");
        }
        System.out.println("");

        for (i=0; i<bil.length; i++){
            for (j=i+1; j<bil.length; j++){
                if (bil[i]>bil[j]){
                    tampung = bil[i];
                    bil[i] = bil[j];
                    bil[j] = tampung;
                }
            }
        }

        System.out.print("Setelah diurutkan = ");
        for (i=0; i<bil.length-1; i++){
            System.out.print(bil[i]+",");
        }
        System.out.print(bil[bil.length-1]);
        
    }
    
}
