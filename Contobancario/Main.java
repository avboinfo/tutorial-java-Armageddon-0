import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        ContoBancario contoDiGiulietta=new ContoBancario(0);
        ContoBancario contoDiRomeo=new ContoBancario(0);
        contoDiGiulietta.versa(2000);
        contoDiGiulietta.prelevi( 500);
        contoDiGiulietta.prelevi( 400);
        contoDiGiulietta.bonifico(200, contoDiRomeo);
        contoDiRomeo.calcoloInteressi(10);
        System.out.println(contoDiGiulietta);
        System.out.println(contoDiRomeo);
        
  
        /*   Scanner leggi=new Scanner(System.in);
        System.out.println("qualle operazione vuoi fare?");
        System.out.println("1 stampa il tuo conto");
        System.out.println("2 fai un prelievo");
        System.out.println("3 fai un bonifico");
        System.out.println("4 versa nel tuo conto");
        int Risposta=leggi.nextInt();

        switch (Risposta) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("la risposta digitata non esiste");
                break;
        }*/
    }
}
