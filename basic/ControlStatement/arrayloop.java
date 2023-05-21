package ControlStatement;

public class arrayloop {
    public static void main(String[] args) {
        int [] bil = {1,2,3,4,5,6,7};
        int jumlah=0, i;

        for (i=0; i<=6; i++){
            if (bil[i]%2==0){
                jumlah += bil[i];
            }
            else{

            }
        }
        System.out.println("bilangan genap dijumlahkan bernilai "+jumlah);
    }
    
}
