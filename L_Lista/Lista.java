package L_Lista;
//pagina 127 in poi per studiare dal libro
public class Lista {
   private  Nodo radice;
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
            if(isEmpty()){
                radice=n;
            }else{
                n.setSuccessivo(radice);
                radice=n;
            }
           
        }



        public void addSorted(Nodo n){
            if(isEmpty()){
                radice=n;
                n.setSuccessivo(null);
                return;
            }
            int vn=n.getValore();
            if(vn<radice.getValore()){
                n.setSuccessivo(radice);
                radice=n;
                return;
            }
            Nodo p1=radice;
            Nodo p2=radice.getSuccessivo();
            while (vn>p1.getValore() && p2!=null && vn>p2.getValore()) {
                p1=p2;
                p2=p1.getSuccessivo();

            }
            n.setSuccessivo(p2);
            p1.setSuccessivo(n);   
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
