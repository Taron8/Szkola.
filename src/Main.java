public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Osoba osoba = new Osoba();
        osoba.setImie("jan");
        System.out.println("Imie naszej osoby"+osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek"+osoba.getWiek());

        Osoba osoba2 = new Osoba("ola","Starsza",19);
        System.out.println(osoba2);
        */

        Uczen uczen1P1 = new Uczen("Emil","Smalandzki",12);
        Uczen uczen1P2 = new Uczen("Emilia","Pragmatyczna",9);
        uczen1P2.dyzuruj();
        System.out.println(uczen1P2);
        System.out.println(uczen1P1);
        Nauczyciel NauczycielSn = new Nauczyciel("Sebastian","Nowak", "jezyk polski","wf");
        System.out.println(NauczycielSn);
        Uczen uczen3 = new Uczen("Zbigniew","Chujowy",12);
        System.out.println(uczen3);
        Klasa klasa2AC = new Klasa("Klasa_ac",uczen1P2,uczen1P1);
        klasa2AC.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa2AC);
        Klasa klasa3AC = new Klasa(klasa2AC);
        System.out.println(klasa3AC);
        Wychowawca wychowawca = new Wychowawca("Anna","Maciej",klasa3AC,"technika","matematyka","fizyka");
        System.out.println(wychowawca);
        Szkola zs10 = Szkola.getSzkola();
    }
}