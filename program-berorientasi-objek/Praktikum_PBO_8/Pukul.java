package Praktikum_PBO_8;

public class Pukul implements AlatMusik{
    private String jenis;
    public String nada;
    
    Pukul(){
        jenis = "pukul";
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
        System.out.println("alat musik ini dimainkan dengan cara dipukul");
    }

    @Override
    public void setelNada(String nada){
        this.nada = nada;
    }

}
