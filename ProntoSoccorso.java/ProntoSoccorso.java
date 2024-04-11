package ProntoSoccorso;

public class ProntoSoccorso {

    Lista<Paziente> ps;

    public ProntoSoccorso() {
        ps = new Lista<>();
        loadFromFile();
    }

    private void loadFromFile() {
        // per il momento lo facciamo "sdozzo"
        ps.addTail( new Paziente("Mario", "Rossi", "white") );
        ps.addTail( new Paziente("Maria", "Rossi", "yellow") );
        ps.addTail( new Paziente("Benedetta", "Italia", "yellow") );
        ps.addTail( new Paziente("Riccardina", "Gamberini", "red") );
    }

    @Override
    public String toString() {
        return "ProntoSoccorso [ps=" + ps + "]";
    }
    





}