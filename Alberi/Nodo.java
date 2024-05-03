package Alberi;

public class Nodo {
    Nodo figlio_sx;
    Nodo figlio_dx;
    double valore;

    public Nodo(Nodo figlio_sx, Nodo figlio_dx, double valore) {
        this.figlio_sx = figlio_sx;
        this.figlio_dx = figlio_dx;
        this.valore = valore;
    }

    public Nodo() {
        this(null, null, 0);
    }
    public Nodo getFiglio_sx() {
        return figlio_sx;
    }

    public Nodo getFiglio_dx() {
        return figlio_dx;
    }

    public void setFiglio_sx(Nodo figlio_sx) {
        this.figlio_sx = figlio_sx;
    }

    public void setFiglio_dx(Nodo figlio_dx) {
        this.figlio_dx = figlio_dx;
    }

    @Override
    public String toString() {
        return "valore=" + valore;
    }

    
}
