package Esercizio2;

public class Main {
    public static void main(String[] args){
        Telefono Casa = new Telefono("332 58 97 892");

        // Simulazione chiamate
        Casa.eseguiChiamata("320 33 11 222", 5);
        Casa.eseguiChiamata("321 11 22 333", 4);
        Casa.eseguiChiamata("322 22 33 111", 1);


        // Stampo dati SIM
        Casa.stampaDati();

    }
}
