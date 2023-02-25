package ModyfikatoryDostêpu_Enkapsulacja;

public class Uzytkownik {
    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;

    }

    public boolean czyMozeLegalnieKipicAlkohol() {
        if(wiek >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek > 0) {
            this.wiek = wiek;
        } else {
            throw new RuntimeException("Wiek musi byc wiekszy od 0");
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}