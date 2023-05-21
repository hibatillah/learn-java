package polimorfisme_tugas;
import javax.swing.JOptionPane;

public class JuniorProgrammer extends Programmer{
    int Salary= 2500;
    int Overwork= 20;
    
    @Override
     protected void Nama(){
        System.out.println("Detail of Junior Programmer Jobdesk ");
        System.out.println(" ");
    }
    
    @Override
    protected void Aturan(){
        System.out.println("Code, test and troubleshoot programs utilizing the appropriate hardware"
            + "database and programming technology");
        System.out.println(" ");
        
    }
    @Override
    protected void Gaji (){
        System.out.println("Salary of Junior Programmer : $"+Salary);
        System.out.println("Overwork payment of Junior Programmer: $"+Overwork);
        System.out.println(" ");
    }
    
    public void DataJP(){
        
        String Nama = JOptionPane.showInputDialog ("Nama Pekerja:");
        int Gender =  Integer.parseInt(JOptionPane.showInputDialog 
            ("Jenis Kelamin: \n 1.Laki-Laki \n2.Perempuan"));
        int Usia = Integer.parseInt(JOptionPane.showInputDialog ("Usia: "));
        
        switch (Gender){
            case 1:
                System.out.println("Jenis Kelamin : Laki-Laki");
                break;
            case 2:
                System.out.println("Jenis Kelamin : Perempuan");
                break;
        }
        
        System.out.println("Nama pekerja  : "+Nama);
        System.out.println("Usia pekerja  : "+Usia);
        System.out.println("Jenis Kelamin : "+Gender);
        
   }
}

