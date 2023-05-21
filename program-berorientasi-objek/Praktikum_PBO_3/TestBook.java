package Praktikum_PBO_3;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setTitle("Harry Potter and The Goblet of Fire");
        b1.setAuthor("JK Rowling");

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());

        b1.tampilInfo();
    }
    
}
