package ModyfikatoryDostêpu_Enkapsulacja;

public class MainUzytkownik {
    public static void main(String[] args) {

        Uzytkownik mariusz = new Uzytkownik(20, "Mariusz");
        //mariusz.setWiek(-1);

        if(mariusz.czyMozeLegalnieKipicAlkohol()) {
            System.out.println("Moze kupic");
        } else {
            System.out.println("Nie moze kupic");
        }
    }
}
