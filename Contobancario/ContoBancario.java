public class ContoBancario{
    float saldo;

    public ContoBancario(float saldo){
        this.saldo=saldo;
    }

    public float prelevi(float importo){
       if(saldo<0){
        System.out.println("il tuo conto non ha soldi");
        return saldo;  
       }else{
         saldo= saldo-importo;
        return saldo;
       }
    }

    public float bonifico(float importo, ContoBancario destinatario){
       if(saldo<0){
            System.out.println("il tuo conto non ha soldi");
            return saldo;        
       }else{
         saldo=saldo-importo;
        destinatario.versa(importo);
        
        return saldo;
       }
    }

public float calcoloInteressi(float percentuale){
    saldo+=(saldo/100)*percentuale;
    return saldo;
}

    public float versa(float importo){
        saldo= saldo+importo;
        return saldo;
    }

    public String toString(){
        return "Il tuo saldo rimanente e di: "+saldo;
    }
}