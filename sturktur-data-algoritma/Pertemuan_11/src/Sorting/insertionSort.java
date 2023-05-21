public class insertionSort {
    public static void main(String[] args) {
        int[] angka = {1,9,5,4,6,3,8,2,7,10};
        int temp, j;

        for (int i=2; i<angka.length; i++){
            temp = angka[i];
            j = i-1;
            while(angka[j]>temp && j>1){
                angka[j+1] = angka[j];
                j = j-1;
            }
            if (temp >= angka[j]) {
                angka[j + 1] = temp;
            } else {
                angka[j + 1] = angka[j];
                angka[j] = temp;
            }
        }

        for (int i=0; i<angka.length; i++){
            System.out.print(angka[i] + " ");
        }
    }
}
