package UTS;
public class TestAkunBank {
    public static void main(String[] args) {
         AkunBank N1 = new AkunBank("Mandiri", "Rina", "108000112478", 1, 12000000);

         N1.dataNasabah();
         System.out.println();

         N1.setDebit(500000);  //input debit
         N1.setKredit(1000000);    //input kredit
         N1.infoDebitKredit();   //saldo setelah debit kredit
         System.out.println();

         N1.Bunga();
         N1.Pajak();
         N1.infoBungaPajak();   //saldo setelah bunga & pajak
         System.out.println();
    }
    
}
