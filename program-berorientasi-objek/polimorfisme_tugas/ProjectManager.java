package polimorfisme_tugas;

public class ProjectManager extends Programmer {
    int Salary= 6000;
    int Overwork= 50;
    
    @Override
     protected void Nama(){
        System.out.println("Detail of Project Manager Jobdesk ");
        System.out.println(" ");
    }
    
    @Override
    protected void Aturan(){
        System.out.println("Activity and resource planning");
        System.out.println("Organizing and motivating a project team");
        System.out.println("Controlling time management");
        System.out.println("Cost estimating and developing the budget");
        System.out.println("Ensuring costumer satisfaction");
        System.out.println("Analysing and managing project risk");
        System.out.println("Monitoring progress");
        System.out.println();
    }

    @Override
    protected void Gaji (){
        System.out.println("Salary of Project Manager : $"+Salary);
        System.out.println("Overwork payment of Project Manager: $"+Overwork);
        System.out.println(" ");
    }
    
}
