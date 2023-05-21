package Array;

// find index
public class Tugas24 {
    public static void main(String[] args) {
        double nilai[] = {5.5, 7.7, 8.3, 9.0, 11.5};
        double min = nilai[0];
        double total=0;
        double rata=0;
        int indeks=0;
        int bawahrata=0;
        
        for (int i=0; i<nilai.length; i++){
        total += nilai[i];
            
            if (i==0){
                min = nilai[i];
            } else if (nilai[i]<min){
                min = nilai[i];
            }
        }
        rata = total/nilai.length;
        
        for (int i=0; i<nilai.length; i++){
            if (nilai[i]<rata){
                bawahrata += 1;
            } else {
                bawahrata += 0;
            }
        }

        for (int i=0; i<nilai.length; i++){
            if (nilai[i]==min){
                indeks = i;
            }
        }
        System.out.println("Total nilai\t: "+total+"\nRata-rata\t: "+rata+
                "\nAda "+bawahrata+" nilai dibawah rata-rata\nNilai minimum "+
                min+", pada indeks "+indeks);
    }
    
}
