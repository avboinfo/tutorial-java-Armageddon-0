package F_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LeggiScriviFile{
   public void scriviFile(String filename){
    File f=new File(filename);
    try{
    PrintWriter pw = new PrintWriter(f);
    for (int index = 0; index<10 ; index++) {
        pw.printf("%2f %f \n", Math.random(),Math.random());   

    }
    pw.close();
    }catch (FileNotFoundException e){
        System.out.println("ERRORE:"+e.getMessage());
    }

   }
   
    public static void main(String[] args){
        System.out.printf("\n program started \n");
        LeggiScriviFile lsf = new LeggiScriviFile();
        lsf.scriviFile("F_File/LeggiScriviFile.txt");

    }
    
}