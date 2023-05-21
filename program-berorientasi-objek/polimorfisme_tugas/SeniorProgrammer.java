package polimorfisme_tugas;

public class SeniorProgrammer extends Programmer {
    int Salary= 4000;
    int Overwork= 40;
    
    @Override
     protected void Nama(){
        System.out.println("Detail of Senior Programmer Jobdesk ");
        System.out.println(" ");
    }
    
    @Override
    protected void Aturan(){
        System.out.println("Define, Develop, test analyse and maintain new software "
                + "applications in support of the achievement of business requirements");
        System.out.println(" ");
        
    }
    @Override
    protected void Gaji (){
        System.out.println("Salary of Project Manager : $"+Salary);
        System.out.println("Overwork payment of Senior Programmer: $"+Overwork);
        System.out.println(" ");
    }
}
