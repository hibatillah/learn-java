package Praktikum_PBO_3;

public class TestTiket {
    public static void main(String[] args) {
        Tiket t1 = new Tiket();
        Tiket t2 = new Tiket();

        System.out.println("Tiket 1");
        t1.infoTiket();
        System.out.println();
        System.out.println("Tiket 2");
        t2.setMaskapai("Citilink");
        t2.setNo_kursi("A5");
        t2.setKeberangkatan("05:30");
        t2.setTgl_terbang("01 April 2020");
        t2.infoTiket();
        System.out.println();

        System.out.println("Update Data");

        System.out.println("Tiket 1");
        t1.setNo_kursi("C12");
        t1.setKeberangkatan("11:00");
        t1.setTgl_terbang("01 April 2020");
        t1.infoTiket();
        System.out.println();
        System.out.println("Tiket 2");
        t2.setKeberangkatan("13:00");
        t2.infoTiket();
        System.out.println();
        
    }
    
}