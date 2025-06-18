package Esercizio1;

import static Esercizio1.Rettangolo.stampaDueRettangoli;
import static Esercizio1.Rettangolo.stampaRettangolo;

public class Main {
    public static void main(String[] args){

        Rettangolo r1 = new Rettangolo(3, 9);
        Rettangolo r2 = new Rettangolo(6, 13);

        stampaRettangolo(r1);
        stampaDueRettangoli(r1, r2);

    }

}
