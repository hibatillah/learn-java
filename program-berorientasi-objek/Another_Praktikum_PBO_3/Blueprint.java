package Another_Praktikum_PBO_3;

public class Blueprint {
    public int bil1;
    public double bil2, hasil;
    public String tanda;

    public Blueprint(int bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double Hitung(String tanda){
        switch (tanda){
            case "+":
                hasil = (double)bil1 + bil2;
                break;
            case "-":
                hasil = (double)bil1 - bil2;
                break;
        }
        return hasil;
    }
    
}
