package Praktikum_PBO_3;
import javax.swing.JOptionPane;

public class Passengers {
    private String fullname, gender, destination, desc;
    int age;

    Passengers(){
        fullname = gender = destination = desc = null;
        age = 0;
    }    

    void getData(){
        fullname = JOptionPane.showInputDialog("Nama: ");
        gender = JOptionPane.showInputDialog("Gender: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("umur: "));
        destination = JOptionPane.showInputDialog("Destinasi");

        if (age<3){
            desc = "Penumpang tidak dikenakan biaya";
        } else if (age>=3 && age<=5){
            desc = "Penumpang ini dikenakan biaya sebesar 70% dari total";
        } else if (age>5){
            desc = "Biaya full";
        }
    }

    void infoData(){
        System.out.println(fullname+"\t\t"+age+"\t"+gender+"\t"+destination+"\t\t"+desc);
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
