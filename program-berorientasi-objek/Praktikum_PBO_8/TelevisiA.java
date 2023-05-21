package Praktikum_PBO_8;

public class TelevisiA implements Control{
    String[] channelTV = {"RCTI", "SCTV", "INDOSIAR", "TRANS TV", "TPI"};

    public void pindahChannel(int channel){
        System.out.println("Pindah channel pada tv A ke : " + channelTV[channel]);
    }

    public void PerbesarVolume(int intensitas){
        System.out.println("Perbesar intensitas volume pada tv A sebanyak : " + intensitas);
    }

    public void PerkecilVolume(int intensitas){
        System.out.println("Perbesar intensitas volume pada tv A sebanyak : " + intensitas);
    }
    
}
