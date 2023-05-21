package Praktikum_PBO_8;
import Praktikum_PBO_8.SMSNotification;
import Praktikum_PBO_8.EmailNotification;

public class DemoNotifikasi {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        SMSNotification mail = new SMSNotification();
        
        email.sendMessage("19tiepbo@pcr.ac.id", "Sorry, there is no give up word in my dictionary");
        mail.sendMessage("+6200008888", "PBO is easy peasy");
    }    
}
