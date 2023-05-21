class Soal4 {
    public Soal4(){
        System.out.println("A");
    }
}

class B extends Soal4{
    public B(){
        System.out.println("B");
    }
}

class C extends B{
    public C(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
