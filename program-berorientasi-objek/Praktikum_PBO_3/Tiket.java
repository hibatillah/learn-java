package Praktikum_PBO_3;

public class Tiket{
    private String maskapai;
    private String no_kursi;
    private String keberangkatan;
    private String tgl_terbang;

    public Tiket(){
        maskapai = "Garuda Indonesia";
        no_kursi = null; 
    	keberangkatan = null;
    	tgl_terbang = null;
    }

    public String getMaskapai() {
        return maskapai;
    }
    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getNo_kursi() {
        return no_kursi;
    }
    public void setNo_kursi(String no_kursi) {
        this.no_kursi = no_kursi;
    }

    public String getKeberangkatan() {
        return keberangkatan;
    }
    public void setKeberangkatan(String keberangkatan) {
        this.keberangkatan = keberangkatan;
    }

    public String getTgl_terbang() {
        return tgl_terbang;
    }
    public void setTgl_terbang(String tgl_terbang) {
        this.tgl_terbang = tgl_terbang;
    }

    public void infoTiket(){
        System.out.println("Maskapai\t\t: "+maskapai
            +"\nNo. Kursi\t\t: "+no_kursi
            +"\nKeberangkatan\t\t: "+keberangkatan
            +"\nTanggal Penerbangan\t: "+tgl_terbang);
    }
    
}
