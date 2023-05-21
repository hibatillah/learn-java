package Relasi;
class Bank {
    private String namaBank;
    private int jmhPegawai;
    private String [] IDPegawai = new String [5];
    private String [] namaPegawai = new String [5];
    
    public Bank(){
    }

    public Bank(String namaBank){
        this.namaBank = namaBank;
    }

    //info bank
    public void infoBank(){
        System.out.println("---DATA PEGAWAI BANK---"
            + "\nNama Bank\t: " + getNamaBank() 
            + "\nJumlah Pegawai\t: " + getJumlahPegawai());
    }

    //print data pegawai bank
    public void dataPegawai(){
        System.out.println("\nID\tNama Pegawai");
        for(int i=0; i<getJumlahPegawai(); i++){
            System.out.println(getIDPegawai(i) + "\t" + getNamaPegawai(i));
        }
    }
    
    public String getIDPegawai(int indeks){
        return IDPegawai[indeks];
    }
    public void setIDPegawai(String IDPegawai){
        if (jmhPegawai < this.IDPegawai.length){
            this.IDPegawai[jmhPegawai] = IDPegawai;
        }
    }
    
    public String getNamaPegawai(int indeks) {
        return namaPegawai[indeks];
    }
    public void setNamaPegawai(String namaPegawai) {
        if (jmhPegawai<this.namaPegawai.length){
            this.namaPegawai[jmhPegawai] = namaPegawai;
        }
    }

    // set id dan nama pegawai
    public String getPegawai(int indeks) {
        return namaPegawai[indeks];
    }
    public void setPegawai(String IDPegawai, String namaPegawai) {
        if (jmhPegawai<this.namaPegawai.length){
            this.IDPegawai[jmhPegawai] = IDPegawai;
            this.namaPegawai[jmhPegawai] = namaPegawai;
            jmhPegawai++;
        }
    }
        
    public String getNamaBank(){
        return namaBank = namaBank;
    }
    public void setNamaBank(String namaBank){
        this.namaBank = namaBank;
    }
    
    public int getJumlahPegawai(){
        return jmhPegawai;
    }
    public void setJumlahPegawai(int jmhPegawai){
        this.jmhPegawai = jmhPegawai;
    }
    
}
