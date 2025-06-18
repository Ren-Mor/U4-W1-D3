package Esercizio2;

public class Chiamata {

    private int durata;
    private String calledNum;

    // Creazione costruttore
    public Chiamata(int durata, String calledNum){
        this.durata = durata;
        this.calledNum = calledNum;
    }

    // Metodi Get
    public int getDurata(){
        return durata;
    }

    public String getCalledNum(){
        return calledNum;
    }

    // Rappresentazione telefonata
    @Override
    public String toString() {
        return "Numero: " + calledNum + ", Durata: " + durata + " minuti";
    }


}
