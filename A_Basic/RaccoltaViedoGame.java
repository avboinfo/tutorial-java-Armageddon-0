import java.util.*;
import java.io.*;


public class RaccoltaViedoGame {
    ArrayList<VideoGame> lista;
    public RaccoltaViedoGame(String file) throws FileNotFoundException{
       lista=new ArrayList<VideoGame>();
       File f= new File(file);
        try{

            Scanner fileInput =new Scanner(f);
            while(fileInput.hasNextLine()){
                String line= fileInput.nextLine();
                String[] field=line.split(";");
                lista.add(new VideoGame(field[0],field[1],Float.parseFloat(field[2]),Integer.parseInt(field[3])));
            }
            fileInput.close();
        }catch(Exception e){
            System.out.println("errore");
        }
    }

    public String toString(){
        String s="Libreria:";
        for(int i=0;i<lista.size();i++){
            s += lista.get(i)+"\n";
        }
        return s;
    }
}
