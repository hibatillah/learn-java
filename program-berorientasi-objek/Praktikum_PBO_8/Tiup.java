package Praktikum_PBO_8;

public class Tiup implements AlatMusik{
    private String jenis;
    public String nada;

    Tiup(){
        jenis = "tiup";
        nada = null;
    }

    public String infoAlatMusik(){
        jenisAlatMusik();
        mainkan();
        return null;
    }

    @Override
    public void jenisAlatMusik(){
        System.out.println("ini adalah alat musik " + jenis);
    }
    
    @Override
    public void mainkan(){
        System.out.println("alat musik ini dimainkan dengan cara ditiup");
    }

    @Override
    public void setelNada(String nada){
        this.nada = nada;
    }
    
}
