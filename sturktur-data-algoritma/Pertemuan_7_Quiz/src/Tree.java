public class Tree {
    private static Node root;
    public Tree(){
        root = null;
    }

    public boolean lookup(int data){
        return (lookup(root, data));
    }

    private boolean lookup(Node find, int data){
        if (find == null){
            return (false);
        }
        if (data == find.iData){
            return(true);
        }
        else if(data < find.iData){
            return(lookup(find.leftChild, data));
        }
        else {
            return (lookup(find.rightChild, data));
        }
    }

    public int finMin(Node tes){
        Node min = tes;
        while (min.leftChild != null){
            min = min.leftChild;
        }
        return min.iData;
    }

    public int finMin(){
        return (finMin(root));
    }

    public int finMax(Node tes){
        Node max = tes;
        while(max.rightChild != null){
            max = max.rightChild;
        }
        return max.iData;
    }

    public int finMax(){
        return (finMax(root));
    }

    public int size(){
        return (size(root));
    }

    private int size(Node node){
        if (node == null) return (0);
        else{
            return(size(node.leftChild) + 1 + size(node.rightChild));
        }
    }

    public void insert(int id, float fd){
        Node baru = new Node(id, fd);
        if(root == null){
            System.out.println("Node baru " + id + " sebagai root");
            root = baru;
        }
        else {
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if (id < current.iData){
                    current = current.leftChild;
                    if (current == null){
                        System.out.println("Insert " + id + " sebagai anak kiri dari " + parent.iData);
                        parent.leftChild = baru;
                        break;
                    }
                }
                else {
                    current = current.rightChild;
                    if (current == null){
                        System.out.println("Insert " + id + " sebagai anak kanan dari " + parent.iData);
                        parent.rightChild = baru;
                        break;
                    }
                }
            }
        }
    }

    public void printTree(){
        printTree(root);
        System.out.println();
    }

    public void printTree(Node localroot){
        if (localroot != null){
            printTree(localroot.leftChild);
            localroot.displayNode();
            printTree(localroot.rightChild);
        }
    }

    public void InOrder(){
        InOrder(root);
        System.out.println();
    }

    public void InOrder(Node localroot){
        if (localroot != null){
            InOrder(localroot.leftChild);
            localroot.displayNode();
            InOrder(localroot.rightChild);
        }
    }

    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }

    public void PostOrder(Node localroot){
        if (localroot != null){
            PostOrder(localroot.leftChild);
            PostOrder(localroot.rightChild);
            localroot.displayNode();
        }
    }

    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }

    public void PreOrder(Node localroot){
        if (localroot != null){
            localroot.displayNode();
            PreOrder(localroot.leftChild);
            PreOrder(localroot.rightChild);
        }
    }


    public void Ujung(){
        Ujung(root);
        System.out.println();
    }

    public void Ujung(Node localroot){
        if (localroot != null){
            if (localroot.leftChild==null && localroot.rightChild==null){
                localroot.displayNode();
            }
            else {
                Ujung(localroot.leftChild);
                Ujung(localroot.rightChild);
            }
        }
    }


    public static void main(String[] args) {
        Tree pohon = new Tree();
        pohon.insert(2,3);
        pohon.insert(1,3);
        pohon.insert(5,3);
        pohon.insert(7,3);
        pohon.insert(3,3);
        pohon.insert(0,3);
        pohon.insert(1,3);
        pohon.insert(0,3);
        pohon.insert(4,3);
        pohon.insert(6,3);
        System.out.println("\nNode yang tidak memiliki child");
        pohon.Ujung();
    }
}
