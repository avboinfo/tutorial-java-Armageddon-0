package SpesaAlSupermercato;

public class Main {
    
    public static void main(String[] args) {
        Lista<Spesa<Integer>> lista=new Lista<Spesa<Integer>>();
//inserimento di prodotti nella lista
        Spesa<Integer> s1=new Spesa<Integer>(1, 10, "cioccolato ");
        Spesa<Integer> s2=new Spesa<Integer>(2, 20, "banane");
        Spesa<Integer> s3=new Spesa<Integer>(3, 40, "vigil");
        Spesa<Integer> s4=new Spesa<Integer>(4, 100, "gu");
//aggiunta di prodotti alla lista
       
        lista.addHead(s1);
        lista.addHead(s2);
        lista.addHead(s3);
        lista.addHead(s4);
        lista.remuveHead();
        lista.remuveHeadCodice(1);

        
        System.out.println(lista.toString());

        int costo=lista.calcoloCosto();
        System.out.println(costo);
//stampa elenco prodotti
        lista.stampaElenco();

    }
}
