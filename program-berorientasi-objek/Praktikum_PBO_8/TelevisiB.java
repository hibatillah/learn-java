package Praktikum_PBO_8;

public class TelevisiB implements Control{
    String[] chanTV = {"TVRI", "LA TV", "TV 7", "RCTI", "SCTY"};

    public void pindahChannel(int channel){
        System.out.println("Pindah channel pada tv B ke : " + chanTV[channel]);
    }

    public void PerbesarVolume(int intensitas){
        System.out.println("Perbesar intensitas volume pada tv B sebanyak : " + intensitas);
    }

    public void PerkecilVolume(int intensitas){
        System.out.println("Perbesar intensitas volume pada tv B sebanyak : " + intensitas);
    }
    
}
