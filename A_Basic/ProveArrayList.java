/*import java.util.ArrayList;
import java.util.Collections;
*/
import java.util.*;
public class ProveArrayList {
    
    public static void main(String[] args) {
        System.out.println("parte funzione");
        ArrayList<String> T= new ArrayList<>();
        T.add("uno");
        T.add("due");
        T.add("tre");
        T.add("quattro");
        T.add("Cinque");
        T.add("due");

        T.remove(1);
        //Collections.sort(T); //per ordinare l'ArrayList<T>;
        T.add(1, "due");
        System.out.println(T);

        for(String s : T ){       // for  moderno i sostituisce il contatore / posizioni
            System.out.println(s);
        }

        for (int i=0;i<T.size();i++){ //for vecchio stampo
            String s=T.get(i);
            System.out.println(s);
        }

        // compara 2 stringhe e se esce 0 sono uguali 
        //< 0 se la stringa è lessicograficamente minore dell'altra stringa
        //> 0 se la stringa è lessicograficamente maggiore dell'altra stringa (più caratteri)
        System.out.println("Ancona".compareTo("Bologna"));

        T.forEach(s -> {
            //T.add("ciao");
            System.out.println(s);
            //return;
        });
       
       
    }
}
