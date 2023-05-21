package Relasi;

public class Pegawai {
    private String namaPegawai;
    private String id;
    
    public Pegawai(){

    }
    
    public Pegawai(String namaPegawai, String id){
        this.namaPegawai = namaPegawai;
        this.id = id;
    }
    
    public String getNamaPegawai(){
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    
}
