 package SpesaAlSupermercato;


class Spesa<integer>{
    int codice;
    int costo;
    String descrizione;

    Lista<integer> Lista1=new Lista<integer>();

    public Spesa(int codice, int costo, String descrizione){
        this.codice=codice;
        this.costo=costo;
        this.descrizione=descrizione;
    }

    public String toString(){
        return "Codice: "+codice+" Costo: "+costo+" Descrizione: "+descrizione;
    }

    public void setCodice(int codice){
        this.codice=codice;
    }

    public void setCosto(int costo){
        this.costo=costo;
    }

    public void setDescrizione(String descrizione){
        this.descrizione=descrizione;
    }

    public int getCodice(){
        return codice;
    }

    public int getCosto(){
        return costo;
    }

    public String getDescrizione(){
        return descrizione;
    }
   
    


}