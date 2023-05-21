import javax.swing.JOptionPane;

public class SimpleSequentialSearch {
    public static void main(String[] args) {
        int [] a = {1,5,3,8,3,6,2};
        int flag = 0;

        int j = Integer.parseInt(JOptionPane.showInputDialog(("Masukkan angka yang dicari: ")));

        for (int i=0; i< a.length; i++){
            if (j==a[i]){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
        }

        if (flag ==1){
            System.out.println("Data yang dicari: " + j + " ada ");
        }
        else{
            System.out.println("Data yang dicari: " + j + " tidak ada ");
        }
    }
}
