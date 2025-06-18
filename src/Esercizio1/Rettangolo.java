package Esercizio1;

public class Rettangolo {

    // Dichiaro attributi privati
    private int  altezza;
    private int  base;

    // Scrivo il costruttore
    public Rettangolo(int altezza, int base) {
        this.altezza = altezza;
        this.base = base;
    }

    //Scrivo Getter e Setter
    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza){
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    // Metodo per calcolo perimetro
    public int calcoloPerimetro() {
        return 2 * (altezza + base);
    }

    // Metodo per calcolo area
    public int calcoloArea() {
        return base * altezza;
    }

    // Metodo per stampare un rettangolo
    public static void stampaRettangolo(Rettangolo r){
        System.out.println("Rettangolo:");
        System.out.println("Perimetro: " + r.calcoloPerimetro());
        System.out.println("Area: " + r.calcoloArea());
    }

    // Metodo per stampare due rettangoli con somma di area e perimetro
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Rettangolo uno:");
        stampaRettangolo(r1);
        System.out.println("Rettangolo due:");
        stampaRettangolo(r2);

        int sommaAree = r1.calcoloArea() + r2.calcoloArea();
        int sommaPerimetri = r1.calcoloPerimetro() + r2.calcoloPerimetro();
    }

}
