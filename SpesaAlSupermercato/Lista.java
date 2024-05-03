package SpesaAlSupermercato;

public class Lista<T> {
    Nodo<T> root;
    public Lista(){
        this.root=null;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void addHead( T v ) {
        Nodo<T> n = new Nodo<>(v);
        if (isEmpty()) root=n;
        else {
            n.setSuccessivo(root);
            root = n;
        }
    }


    public void remuveHead() {
        if (root != null) {
            Nodo<T> r = root;
            root = root.getSuccessivo();
            r.setSuccessivo(null);
        } else {
            System.out.println("Lista vuota");
        }
    }
    
    
    public void remuveHeadCodice(int  codice){
        Nodo r=root;
        Nodo p=null;

        while(r!=null){
            if(r.getValore().equals(codice)){
                if(p==null){
                    root=r.getSuccessivo();
                }else{
                    p.setSuccessivo(r.getSuccessivo());
                   
                }
                return;
            }
            p=r;
            r=r.getSuccessivo();
        }
        System.out.println("prodotto non esiste");
    }
    public void stampaElenco(){
        Nodo<T> r = root;
        while (r!=null) {
            System.out.println(r);
            r=r.getSuccessivo();
        }
    }

    public int calcoloCosto() {
        int costo;
        Nodo<T> r = root;
        while (r != null) {
            costo = r.getValore();
            r = r.getSuccessivo();
        }
        return costo;
    }
    
   
    public String toString() {
        java.lang.String s = "\nLIST BEGIN *************\n";
        Nodo<T> r = root;
        while (r!=null) {
            s += r + "\n";
            r=r.getSuccessivo();
        }
        s += "********************* LIST END\n";
        return s;
    }
}
