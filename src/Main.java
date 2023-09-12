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
        System.out.println(uczen1P2);
        System.out.println(uczen1P1);
        Nauczyciel NauczycielSn = new Nauczyciel("Sebastian","Nowak", "jezyk polski","wf");
        System.out.println(NauczycielSn);

        Klasa klasa2AC = new Klasa("Klasa_ac",uczen1P2,uczen1P1);
        System.out.println(klasa2AC);
    }
}