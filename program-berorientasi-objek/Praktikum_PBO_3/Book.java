package Praktikum_PBO_3;

public class Book {
    private String title;
    private String author;

    public Book(){
        title = null;
        author = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void tampilInfo(){
        System.out.println("Judul buku: "+getTitle());
        System.out.println("Penulis buku: "+getAuthor());
    }
    
}
