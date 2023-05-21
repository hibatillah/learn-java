import javax.swing.JOptionPane;

public class SequentialSearchSentinel {
    public static void main(String[] args) {
        int a[] = new int[9];
        a[0] = 1;
        a[1] = 5;
        a[2] = 7;
        a[3] = 4;
        a[4] = 8;
        a[5] = 3;
        a[6] = 6;
        a[7] = 2;
        int flag = 0;
        int j = 0;

        j = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang dicari: "));
        a[8] = j;

        while (j != a[flag]){
            flag++;
        }

        if (flag < (a.length-1)){
            System.out.println("Data yang dicari: " + j + " ada ");
        }
        else{
            System.out.println("Data yang dicari: " + j + " tidak ada ");
        }
    }
}
