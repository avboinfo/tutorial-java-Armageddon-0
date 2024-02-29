package L_Lista;
//pagina 127 in poi per studiare dal libro
public class Lista {
    Nodo radice;
    public Lista(){
        radice=null;
    }

    public boolean isEmpty(){ //controlla che la radice sia vuota
        return radice==null;
    }

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
        public void addHead(Nodo n){
            if(isEmpty()){
                radice=n;
           }else{
             Nodo p=radice;
             while(p.){

             }
           }

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
