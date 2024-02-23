/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

package S_Stack;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
       try{
        File f=new File("S_Stack/FileDiLettura.csv");
        Scanner sc= new Scanner(f);
        while (sc.hasNextLine()) {
            s.push(sc.nextLine());
            
        }
         System.out.println(s);
         sc.close();
       }catch(FileNotFoundException ex){
            System.out.println("Errore"+ex);
       }
       
   /*     try{
      
       File g=new File("FileFinale.csv");
       PrintWriter scrittura= new PrintWriter(g);
       while (scrittura.nextLine()) {
            System.out.println(s.pop());
       }
    }catch(FileNotFoundException e){
        System.out.println("Errore"+e);
       }*/
       
       
      
        


/* 
        s.push("Juve");
        s.push("Inter");
        System.out.println(s.pop());
        System.out.println(s);*/
    }

}
