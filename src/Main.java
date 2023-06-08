// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Node root = new Node(1);
        root.izquierdo = new Node(2);
        root.derecho = new Node(3);
        root.izquierdo.izquierdo = new Node(4);
        root.izquierdo.derecho = new Node(5);

        System.out.print("RECORRIDO INORDEN: ");
        root.inOrden(root);
        System.out.println();

        System.out.print("RECORRIDO PREORDEN: ");
        root.preOrden(root);
        System.out.println();

        System.out.print("RECORRIDO POSTORDEN: ");
        root.postOrden(root);
        System.out.println();
    }
}
