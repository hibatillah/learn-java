package hibatillah_kuis1;

public class Murid {
    String nama, nim, kelas, nilaiHuruf;
    double MK1, MK2, MK3;

    Murid(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    private void infoMurid(){
        System.out.print(nama+"\t"+nim+"\t"+kelas+"\t");
    }

    private void nilaiAngka(double MK1, double MK2, double MK3){
        this.MK1 = MK1;
        this.MK2 = MK2;
        this.MK3 = MK3;
    }

    private void hurufMK1(){
        if (MK1 >= 81){
            nilaiHuruf = "A";
        }
        else if (MK1 >= 76){
            nilaiHuruf = "AB";
        }
        else if (MK1 >= 66){
            nilaiHuruf = "B";
        }
        else if (MK1 >= 61){
            nilaiHuruf = "BC";
        }
        else if (MK1 >= 51){
            nilaiHuruf = "C";
        }
        else {
            nilaiHuruf = "F";
        }
        System.out.print(MK1+"\t"+nilaiHuruf+"\t");
    }

    private void hurufMK2(){
        if (MK2 >= 85){
            nilaiHuruf = "A";
        }
        else if (MK2 >= 81){
            nilaiHuruf = "AB";
        }
        else if (MK2 >= 66){
            nilaiHuruf = "B";
        }
        else if (MK2 >= 61){
            nilaiHuruf = "BC";
        }
        else if (MK2 >= 51){
            nilaiHuruf = "C";
        }
        else {
            nilaiHuruf = "F";
        }
        System.out.print(MK2+"\t"+nilaiHuruf+"\t");
    }

    private void hurufMK3(){
        if (MK3 >= 83){
            nilaiHuruf = "A";
        }
        else if (MK3 >= 79){
            nilaiHuruf = "AB";
        }
        else if (MK3 >= 66){
            nilaiHuruf = "B";
        }
        else if (MK3 >= 61){
            nilaiHuruf = "BC";
        }
        else if (MK3 >= 51){
            nilaiHuruf = "C";
        }
        else {
            nilaiHuruf = "F";
        }
        System.out.print(MK3+"\t"+nilaiHuruf+"\t");
    }
    
    public static void main(String[] args) {
        Murid murid1 = new Murid("Budi","2157301046","10C");
        Murid murid2 = new Murid("Andi","2157301031","10B");
        Murid murid3 = new Murid("Didi","2157301027","11A");

        System.out.println("Nama\tNIM\t\tKelas\tMK1\t\tMK2\t\tMK3");
        
        murid1.infoMurid();
        murid1.nilaiAngka(80, 85, 77.8);
        murid1.hurufMK1();
        murid1.hurufMK2();
        murid1.hurufMK3();
        System.out.println();
        
        murid2.infoMurid();
        murid2.nilaiAngka(90.2, 82, 70);
        murid2.hurufMK1();
        murid2.hurufMK2();
        murid2.hurufMK3();
        System.out.println();
        
        murid3.infoMurid();
        murid3.nilaiAngka(68, 75.4, 83.9);
        murid3.hurufMK1();
        murid3.hurufMK2();
        murid3.hurufMK3();
        System.out.println();

    }

}
