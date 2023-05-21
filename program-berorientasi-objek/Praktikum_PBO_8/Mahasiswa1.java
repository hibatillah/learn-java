package Praktikum_PBO_8;
import javax.swing.JOptionPane;

public class Mahasiswa1 extends Mahasiswa{
    int nilai[] = new int[3];
    int i, nilaimax;
    int nilaiRata = 0;
    
    Mahasiswa1(String nama){
        super(nama);
    }

    public void infoMahasiswa(){
        System.out.println("Nama : " + super.nama() + "\nNilai tertinggi : " + nilaiMax()
            + "\nNilai Rata-rata : " + nilaiRata());
    }
          
    public void nilai(){
        for(i = 0; i < nilai.length; i++){
            nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Nilai matakuliah " + (i+1)));          
        }
    }

    @Override
    public int nilaiMax(){  
        nilaimax = nilai[0];
        for(i = 0; i < nilai.length; i++){
            if(nilai[i] > nilaimax){
                nilaimax = nilai[i];
            }       
        }
        return nilaimax;
    }
    
    public int nilaiRata(){
        for(i = 0; i < nilai.length; i++){
            nilaiRata += nilai[i];
        }
        return nilaiRata;
    }  
}
