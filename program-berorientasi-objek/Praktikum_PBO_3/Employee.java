package Praktikum_PBO_3;
import java.util.Scanner;

public class Employee{
    private int id, age;
    private String name;
    private double salary;

    Employee(){
        id = age = 0;
        name = null;
        salary = 0;
    }

    void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Id Karyawan: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.println("Masukkan Nama Karyawan: ");
        name =sc.nextLine();

        System.out.println("Masukkan Umur Karyawan: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Masukkan Gaji Karyawan: ");
        salary = Double.parseDouble(sc.nextLine());
    }

    void putData(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
    }
}