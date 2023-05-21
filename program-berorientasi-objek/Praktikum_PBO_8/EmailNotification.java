package Praktikum_PBO_8;

public class EmailNotification implements Notifikasi {
    @Override
     public void sendMessage(String receiver, String content){
        System.out.println("Mengirim email ke: "+receiver
                           +" dengan isi pesan: "+content);
     }
}
