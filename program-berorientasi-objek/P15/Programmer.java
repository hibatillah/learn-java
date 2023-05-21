package P15;
import javax.swing.JOptionPane;

public class Programmer extends Staff {
    private String skill;

    public Programmer(){
        JOptionPane.showMessageDialog(null, "PROGRAMMER");
        skill = null;
    }
    
    // print data
    public void infoProgrammer(){
        System.out.println("NIP : " + super.getNip() + "\nNama : " + super.getNama() 
            + "\nTanggal Masuk : " + super.getTglMasuk() + "\nLama Bekerja : " + super.masaKerja() 
            + " tahun (pada tahun ini)" + "\nSkill : " + skill);
    }

    // input data
    public String getData(){
        super.dataStaff();
        skill = JOptionPane.showInputDialog("Skill pemrograman : ");
        return null;
    }
    
}
