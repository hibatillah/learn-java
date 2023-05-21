import java.io.*;
public class BinaryClassTest {
    private static int cari;
    private static int cacahData;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.println("Berapa data yang akan dimasukkan ke Binary Tree? ");
        cacahData = inputData();

        for (int i = 0; i<cacahData; i++){
            System.out.println("Data ke- " + (i+1) + " = ");
            bt.insert(inputData());
        }
        System.out.println("Data yang akan dicari? ");
        cari = inputData();
        Nodes found = (Nodes) bt.find(cari);

        if (found != null)
            System.out.println("Node dengan key " + cari + " ditemukan.");
        else
            System.out.println("Node dengan key " + cari + " ditemukan.");
    }

    private static int inputData(){
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        try{
            angkaInput = bfr.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkaInput).intValue();
        return Data;
    }

}
