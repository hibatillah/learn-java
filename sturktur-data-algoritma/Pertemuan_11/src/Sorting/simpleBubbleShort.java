public class simpleBubbleShort {
    public static void main(String[] args) {
        // String
        String[] arr = {"now","is","the","time","flower","all"};
        String temp;

        System.out.println("String : ");
        for (int i=0; i<(arr.length); i++){
            for (int j=(arr.length-1); j>i; j--){
                if (arr[j].compareTo (arr[j-1])<0){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }

        // int
        int[] num = {30,17,21,25,19};
        int temp2;

        System.out.println("\n\nint : ");
        for (int i=0; i<(num.length); i++){
            for (int j=(num.length-1); j>i; j--){
                if (num[j] < (num[j-1])){
                    temp2 = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp2;
                }
            }
            System.out.print(num[i] + " ");
        }
    }
}
