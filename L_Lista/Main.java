package L_Lista;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("parti!!!!!!!!!!!!!!!!!!!!!!!");
       
        Lista l= new Lista();
        System.out.println(l);
    /*   for(int i=0;i<10;i++){
        l.add(new Nodo(i, null));
      }
      l.addHead(new Nodo(2024, null));
       */
      
      l.addSorted(new Nodo(300, null));
      l.addSorted(new Nodo(1000, null));
      l.addSorted(new Nodo(20, null));
      l.addSorted(new Nodo(100, null));

      System.out.println(l);
      
       
    
    }
}
