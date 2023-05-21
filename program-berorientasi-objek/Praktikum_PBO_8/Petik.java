package Praktikum_PBO_8;

public class Petik implements AlatMusik{
    private String jenis;
    public String nada;
    
    Petik(){
        jenis = "petik";
        nada = null;
    }

    public void infoAlatMusik(){
        jenisAlatMusik();
        mainkan();
    }

    @Override
    public void jenisAlatMusik(){
        System.out.println("ini adalah alat musik " + jenis);
    }
    
    @Override
    public void mainkan(){
        System.out.println("alat musik ini dimainkan dengan cara dipetik");
    }

    @Override
    public void setelNada(String nada){
        this.nada = nada;
    }
    
}
