package Alberi;

import java.util.ArrayList;

public class Albero {
    Nodo radice;

    public Albero(Nodo radice){
        this.radice = radice;
    }

    public int numeroNodi(){
        ArrayList<Nodo> lista = new ArrayList<>();
        lista.add(radice);
        int conta = 0;

        while (conta < lista.size()){
            Nodo locale = lista.get(conta);
            if (locale.getFiglio_sx() != null)
                lista .add(locale.getFiglio_sx());
            if (locale.getFiglio_dx() != null)
                lista.add(locale.getFiglio_dx());
            conta = conta + 1;
        }

        return conta;
    }

    public int numeroNodi() {

    }

    @Override
    public String toString() {
        ArrayList<Nodo> lista = toArrayList();
        int delimitatore = 1;
        int conta = 1;

        StringBuilder nb = new StringBuilder();
        for (Nodo nodo : lista){
            if (delimitatore <= conta){
                delimitatore = delimitatore * 2; 
            }
            conta++;
        }
        int delimitatore = 1;
        int conta = 1;
        return output;
    }
    
}
