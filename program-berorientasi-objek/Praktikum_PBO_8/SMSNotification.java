package Praktikum_PBO_8;
import Praktikum_PBO_8.Notifikasi;

public class SMSNotification implements Notifikasi {
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim sms ke: "+receiver
                           +" dengan isi pesan: "+content);
    }
}
