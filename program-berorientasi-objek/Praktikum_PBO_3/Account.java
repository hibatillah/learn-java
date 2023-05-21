package Praktikum_PBO_3;

public class Account {
    int a, b;

    public Account(){
        this.a = 0;
        this.b = 0;
    }
    
    public Account(int a, int b){
        this.a = 0;
        this.b = 0;    
    }
    
    public void setNewData(int a, int b){
        this.a = a;
        this.b = b;   
    }
    
    public void showData(){
        System.out.println("Nilai Atribut a: "+this.a);
        System.out.println("Nilai Atribut b: "+this.b);
    }
    
}
