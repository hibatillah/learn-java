package Praktikum_PBO_8;

public class RemoteControl {
    public static final int PINDAH_CHANNEL = 1;
    public static final int PERBESAR_VOLUME = 2;
    public static final int PERKECIL_VOLUME = 3;

    public void kirimPerintahkeTV(int aksi, Control tv, int tombol){
        switch(aksi){
            case PINDAH_CHANNEL: 
                tv.pindahChannel(tombol);
                break;
            case PERBESAR_VOLUME:
                tv.PerbesarVolume(tombol);
                break;
            case PERKECIL_VOLUME:
                tv.PerkecilVolume(tombol);
                break;
        }
    }
    
}
