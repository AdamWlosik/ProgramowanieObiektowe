package Klasa;

public class MainGarnek {

    public static void main(String[] args) {

        /*Garnek garnek = new Garnek();

        garnek.srednica = 7;
        garnek.wysokosc = 5;
        garnek.kolor = "Srebrny";

        System.out.println(garnek.srednica);
        System.out.println(garnek.wysokosc);
        System.out.println(garnek.kolor);*/

       /* Garnek garnek = new Garnek(7, 5, "Srebrny");

        System.out.println(garnek.srednica);
        System.out.println(garnek.wysokosc);
        System.out.println(garnek.kolor);*/

        Garnek garnek = new Garnek(5, 10);
        garnek.kolor = "Czarny";

        //garnek.srednica = 2; // nie mozemy zmieniac bo final int srednica;

        System.out.println(garnek.srednica);
        System.out.println(garnek.wysokosc);
        System.out.println(garnek.kolor);

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true);
        System.out.println(wiadomosc2);

        int temperaura = garnek.zwrocTemperatureWrzeniaWody();
        System.out.println(temperaura);

        garnek.gotujBezInformacji();




    }
}
