public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osoba = new Osoba();
        osoba.setImie("jan");
        System.out.println("Imie naszej osoby"+osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek"+osoba.getWiek());

        Osoba osoba2 = new Osoba("ola","Starsza",19);
        System.out.println(osoba2);
    }
}