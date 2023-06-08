
public class Node {
    public int dato;
    public Node izquierdo;
    public Node derecho;

    public Node(int dato) {
        this.dato = dato;
    }

    public String toString() {
        String s = "nodo" + dato;
        if (izquierdo != null) {
            s += " izquierdo" + izquierdo;
        }
        if (derecho != null) {
            s += " derecho" + derecho;
        }
        return s;
    }

    public void inOrden(Node node) {
        if (node != null) {
            inOrden(node.izquierdo);
            System.out.print(node.dato + " ");
            inOrden(node.derecho);

        }
    }

    public void preOrden(Node node) {
        if (node != null) {
            System.out.print(node.dato + " ");
            preOrden(node.izquierdo);
            preOrden(node.derecho);
        }
    }

    public void postOrden(Node node) {
        if (node != null) {
            postOrden(node.izquierdo);
            postOrden(node.derecho);
            System.out.print(node.dato + " ");
        }
    }

}
