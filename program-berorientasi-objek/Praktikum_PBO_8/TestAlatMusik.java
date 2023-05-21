package Praktikum_PBO_8;

public class TestAlatMusik {
    public static void main(String[] args) {
        Petik pt = new Petik();
        Pukul pk = new Pukul();
        Tiup tp = new Tiup();
    
        pt.infoAlatMusik();
        pt.setelNada("Sol Re Fa");
        System.out.println("nada : " + pt.nada);
        System.out.println();
        
        pk.infoAlatMusik();
        pk.setelNada("Pitch GCEA");
        System.out.println("nada : " + pk.nada);
        System.out.println();
        
        tp.infoAlatMusik();
        tp.setelNada("da mi na ti la da");
        System.out.println("nada : " + tp.nada);
        System.out.println();
        
    }
}

