package komposisi;

public class TestMahasiswaDosen{
   public static void main(String[] args) {
   Dosen D = new Dosen("18345");
   
   D.Mahasiswa(new Mahasiswa("2157301046"),new Kelas ("1 SI C"));
   D.infoDosen();

   }
   
}