package L_Lista;
//pagina 127 in poi per studiare dal libro
public class Lista {
   private  Nodo radice;
   private Nodo head;
   private int elementi;
    public Lista(){
        radice=null;
    }

    public boolean isEmpty(){ //controlla che la radice sia vuota
        return radice==null;
    }

    /**
     * @param n
     */
    public void add(Nodo n){
        if(isEmpty()){
            radice=n;
        }else{
            Nodo p=radice;
            while(p.getSuccessivo()!=null){
                p=p.getSuccessivo();
                
        }
          p.setSuccessivo(n);
        
        }
    }
        public void addHead(Nodo n){   
            //esempio del libro
        
            Nodo m= new Nodo(elementi, n) ;
            m.setSuccessivo(head);
            head=n;

            elementi++;

           }

    

    public String toString(){
        String s="elementi della lista: ";
        Nodo p=radice;
        while (p!=null){
            s += p;
            p=p.getSuccessivo();
        }
        return s;
    }
}
