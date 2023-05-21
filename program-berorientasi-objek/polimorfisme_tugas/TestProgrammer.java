package polimorfisme_tugas;
import javax.swing.JOptionPane;

public class TestProgrammer {
    public static void main(String[] args) {
        Programmer Pro = new Programmer();
        ProjectManager PM = new ProjectManager();
        SeniorProgrammer SP = new SeniorProgrammer();
        JuniorProgrammer JP = new JuniorProgrammer();
        
        Pro.Nama();
        PM.Nama();
        Pro.Aturan();
        PM.Aturan();
        Pro.Gaji();
        PM.Gaji();
        
        SP.Nama();
        Pro.Aturan();
        SP.Aturan();
        Pro.Gaji();
        SP.Gaji();
        
        JP.Nama();
        Pro.Aturan();
        JP.Aturan();
        Pro.Gaji();
        JP.Gaji();
        
        int n = Integer.parseInt (JOptionPane.showInputDialog("Jumlah Pekerja: "));

        JuniorProgrammer PK [] = new JuniorProgrammer [n];
        int i;    
    }
}
