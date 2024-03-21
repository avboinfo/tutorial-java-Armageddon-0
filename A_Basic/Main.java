import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            RaccoltaViedoGame ra=new RaccoltaViedoGame("A_Basic/videogame.csv");
            System.out.println(ra);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
