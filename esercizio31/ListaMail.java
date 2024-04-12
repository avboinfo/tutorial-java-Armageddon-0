package esercizio31;

public class ListaMail<T> {
    NodoMail<T> root;

    public ListaMail() {
        this.root = null;
    }

    public NodoMail<T> getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addHead(T v) {
        NodoMail<T> n = new NodoMail<>(v);
        if (isEmpty()) root = n;
        else {
            n.setSuccessivo(root);
            root = n;
        }
    }

    public void addTail(T v) {
        NodoMail<T> n = new NodoMail<>(v);
        if (root == null) {
            root = n;
        } else {
            NodoMail<T> tmp = root;
            while (tmp.getSuccessivo() != null) tmp = tmp.getSuccessivo();
            tmp.setSuccessivo(n);
        }
    }

    public boolean addAfter(int pos, T v) {
        NodoMail<T> n = new NodoMail<>(v);
        NodoMail<T> tmp = root;
        for (int i = 0; i < pos; i++) {
            if (tmp == null) return false;
            tmp = tmp.getSuccessivo();
        }

        if (tmp == null) return false;

        n.setSuccessivo(tmp.getSuccessivo());
        tmp.setSuccessivo(n);
        return true;
    }

    public java.lang.String toString() {
        java.lang.String s = "\nLIST BEGIN *************\n";
        NodoMail<T> tmp = root;
        while (tmp != null) {
            s += tmp + "\n";
            tmp = tmp.getSuccessivo();
        }
        s += "********************* LIST END\n";
        return s;
    }
}
