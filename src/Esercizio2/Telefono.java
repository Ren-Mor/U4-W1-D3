package Esercizio2;

import java.util.Arrays;

public class Telefono {

    private String numTelefono;
    private int credito;
    private String[] lastCalls;
    private int chiamateFatte;
    int counter = 0;
    // Creazione costruttore
    public Telefono(String numTelefono){
        this.numTelefono = numTelefono;
        this.credito = 0;
        this.lastCalls = new String[5];
        // Questo for serve a non far ritornare null ma una stringa vuota
        for (int i = 0; i < lastCalls.length; i++){
            lastCalls[i] = "";
        }
        this.chiamateFatte = 0;
    }

    // Metodo per fare la chiamata
    public void eseguiChiamata(String num, int durata){
        this.lastCalls[counter] = num + durata;
        this.counter++;
    }

    // Metodo per stampare dati SIM
    public void stampaDati(){
        System.out.println("Numero di telefono: " + numTelefono + ". Credito residuo: " + credito);
        System.out.println("Ultime chiamate: " + Arrays.toString(lastCalls) );

    }

}
