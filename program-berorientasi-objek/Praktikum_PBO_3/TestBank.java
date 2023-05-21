package Praktikum_PBO_3;

public class TestBank {
    public static void main(String[] args) {
        Bank n1 = new Bank("Budi", "2157301046", "20030506", 12350000.500);
        Bank n2 = new Bank();

        System.out.println("Nasabah 1");
        n1.infoNasabah();
        n1.Debit(350000);
        n1.Kredit(500000);
        System.out.println("Setelah Transaksi");
        n1.infoNasabah();

        System.out.println();

        n2.setNama("Agus");
        n2.setNoRek("2157301017");
        n2.setPassword("akuganteng");
        n2.setSaldo(20500150.500);

        System.out.println("Nasabah 2");
        n2.infoNasabah();
        n2.Debit(1000000);
        n2.Kredit(3500000);
        System.out.println("Setelah Transaksi");
        n2.infoNasabah();
    }
    
}
