package esercizio31;
class Mail {
    String mittente, testo, oggetto;
    int data, ora;
     
    public Mail(String mittente, String testo, String oggetto, int data, int ora){
        this.mittente=mittente;
        this.testo=testo;
        this.oggetto=oggetto;
        this.data=data;
        this.ora=ora;
    
    }

    public String cercaMail(String mittente){
        String result = "lista mittenti "+ mittente+ ":\n";
        NodoMail<Mail> p = ps.getRoot();
        while (p!=null){
            if(p.getValore().getMittente().equals(mittente)){
                result += p+"\n";
        }
        p=p.getSuccessivo();
    }
    return result;
}

    public java.lang.String toString(){
        return "Mittente: "+mittente+" Testo: "+testo+" Oggetto: "+oggetto+" Data: "+data+" Ora: "+ora;
    }
}