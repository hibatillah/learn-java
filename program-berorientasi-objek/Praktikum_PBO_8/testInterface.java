package Praktikum_PBO_8;

public class testInterface {
    public static void main(String[] args) {
        TelevisiA tvA = new TelevisiA();
        TelevisiB tvB = new TelevisiB();
        RemoteControl rc = new RemoteControl();

        // kirim perintah ke tv A
        rc.kirimPerintahkeTV(RemoteControl.PINDAH_CHANNEL, tvA, 2);
        rc.kirimPerintahkeTV(RemoteControl.PERBESAR_VOLUME, tvA, 5);
        
        // kirim perintah ke tv B
        rc.kirimPerintahkeTV(RemoteControl.PINDAH_CHANNEL, tvB, 1);
        rc.kirimPerintahkeTV(RemoteControl.PERKECIL_VOLUME, tvB, 3);

    }
    
}
