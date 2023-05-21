public class DDLNCApp {
    public static void main(String[] args) {
        dLink link = new dLink();

        link.insertFirst(6);
        link.insertFirst(3);
        link.insertFirst(9);
        link.printFirst();
        System.out.println();
        link.printLast();

        link.insertLast(7);
        System.out.println();
        link.printFirst();

        link.deleteFirst();
        System.out.println();
        link.printFirst();
        link.deleteLast();
        System.out.println();
        link.printFirst();

        System.out.println();
        link.search(6);
    }
}
