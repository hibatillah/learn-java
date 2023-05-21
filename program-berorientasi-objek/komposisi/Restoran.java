package komposisi;

public class Restoran {
   private final String nama;
   private final Pegawai P[] = new Pegawai[3];
   int i;

    public Restoran(){
        nama = "Resto Lamak";
        for (i=0; i<P.length; i++) {
            P[i] = new Pegawai();
        }
        System.out.println("Daftar pegawai " + nama );
        System.out.println();
    }
    
    // set data pegawai
    public void setPegawai(){
        for (i=0; i<P.length; i++) {
            P[i].setData();
        }
    }

    //print data pegawai
    public double getPegawai(){
        System.out.println("Nama\tJabatan\t\tAlamat");
        for (i=0; i<P.length; i++) {
            P[i].getData();
        }
        return 0;
    }
    
}