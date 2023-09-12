public class Uczen extends Osoba {
    private  int nrUcznia;

    private static int iluUczniow=0;
    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek); //wywolanie konstruktora klasy bazowej
        iluUczniow++;
        nrUcznia = iluUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{ imie: "+ getImie()+" nazwisko: "+getNazwisko() + "nr ucznia: "+nrUcznia+"}";
    }
}
