package Klasa;

public class Garnek {

    int srednica;
    int wysokosc;
    String kolor;

    public Garnek() {
        /*this.srednica = 10;
        this.wysokosc = 5;*/
        // nie dobrze nie hardcodujemy

    }

    public Garnek(int srednica, int wysokosc) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
    }

    public Garnek(int srednica, int wysokosc, String kolor) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    public String gotuj() {
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol) {
        if(czyDodalismySol) {
            return "Gotowwanie z sola";
        } else {
            return "Gotowanie bez soli";
        }
    }

    // nie mo¿emy zdefiniowaæ dwóch metod z t¹ nazw¹ i tym samym typem argumentow
   /* public String gotuj(boolean czyDodalismyPieprz) {
        return "test";
    }*/

    public int zwrocTemperatureWrzeniaWody() {
        return 100;
    }

    public void gotujBezInformacji() { // s³owo kluczowe void nie zwraca wartosci
        wlaczGarnek();
        gotujPrzezPolGodziny();
        wylaczGarnek();
        // z metod mozna wywo³ywaæ inne metody
    }

    private void wlaczGarnek() {
        System.out.println("Wlaczanie garnka");
    }

    private void gotujPrzezPolGodziny() {
        System.out.println("Gotowanie przez 30 min");
    }

    private void wylaczGarnek() {
        System.out.println("Gotowanie przez 30 min");
    }
}
