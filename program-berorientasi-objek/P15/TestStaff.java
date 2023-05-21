package P15;

public class TestStaff {
    public static void main(String[] args) {
        Laboran L = new Laboran();
        L.getData();
        L.infoLaboran();
        System.out.println();
        
        Dosen D = new Dosen();
        D.getData();
        D.infoDosen();
        System.out.println();

        Programmer P = new Programmer();
        P.getData();
        P.infoProgrammer();
        System.out.println();

    }
    
}
