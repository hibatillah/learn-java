package Array;

import javax.swing.JOptionPane;

public class KisiUAS {
    public static void main(String[] args) {
        String barang[] = {"sabun","shampo","roti","susu","gula","mie","kopi","odol","tisu"};
        int jumlah[] = new int[barang.length];
        double harga[] = new double[barang.length];
        double hargabarang[] = new double[barang.length];

        double total=0;
        double diskon=0;
        double totalharga;
        int jumlahitem=0;
        String Diskon = "-";

        System.out.println("List belanja");
        for (int i=0; i<barang.length; i++){
            System.out.println("- "+barang[i]);
        }
        JOptionPane.showMessageDialog(null, "Selamat datang di INDOMARTIN\n");
        for (int i=0; i<barang.length; i++){
            jumlah[i] = Integer.parseInt(JOptionPane.showInputDialog("Jumlah "+barang[i]+" dibeli: "));
            if (barang[i].equalsIgnoreCase("sabun") || barang[i].equalsIgnoreCase("tisu")){
                hargabarang[i] = 5500;
            } 
            else if (barang[i].equalsIgnoreCase("odol") || barang[i].equalsIgnoreCase("kopi")){
                hargabarang[i] = 6500;
            } 
            else if (barang[i].equalsIgnoreCase("shampo")){
                hargabarang[i] = 8500;
            } 
            else if (barang[i].equalsIgnoreCase("minyak")){
                hargabarang[i] = 15500;
            } 
            else if (barang[i].equalsIgnoreCase("susu")){
                hargabarang[i] = 5300;
            } 
            else if (barang[i].equalsIgnoreCase("roti")){
                hargabarang[i] = 4700;
            } 
            else if (barang[i].equalsIgnoreCase("mie")){
                hargabarang[i] = 3100;
            } 
            else if (barang[i].equalsIgnoreCase("gula")){
                hargabarang[i] = 7200;
            } 
            else if (barang[i].equalsIgnoreCase("madu")){
                hargabarang[i] = 11500;
            }
            jumlahitem += jumlah[i];
            harga[i] = jumlah[i]*hargabarang[i];
            total += harga[i];
        }
        String member = JOptionPane.showInputDialog("ingin menggunakan member?");
        if (member.equalsIgnoreCase("iya") || member.equalsIgnoreCase("ya")){
            if (total>50){
                diskon = total*0.1;
                Diskon = "10%";
            } 
        } 
        totalharga = total-diskon;
        System.out.println("\n\n------------\nINDOMARTIN\n------------\nNo. Kasir  : 123\nNama kasir : Alvin\n");
        for (int i=0; i<barang.length; i++){
            System.out.println(barang[i]+"\tRp"+hargabarang[i]+"\nx"+jumlah[i]+"\tRp"+harga[i]+"\n");
        }
        System.out.println("---\nJumlah barang\t"+jumlahitem+" item\nTotal harga\tRp"+total+"\nDiskon\t\t"+
            Diskon+"\n-----\nTotal akhir\tRp"+totalharga+"\n\nTerima Kasih telah berbelanja:)\n");
    }
    
}
