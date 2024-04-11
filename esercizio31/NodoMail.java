package esercizio31;
import java.io.*;
public class NodoMail {
    
    private T valore;
    private NodoMail <T> successivo;

    public NodoMail( T valore ) {
        this.valore = valore;
        successivo = null;
    }

    public void setValore( T valore ) {
        this.valore = valore;
    }

    public T getValore() {
        return valore;
    }

    public NodoMail<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(NodoMail<T> successivo) {
        this.successivo = successivo;
    }
    
    public String toString() {
        return "Il mio valore è: " + valore;
    }
}

