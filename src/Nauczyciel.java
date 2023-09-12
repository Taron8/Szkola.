import java.util.ArrayList;

public sealed class Nauczyciel extends  Osoba permits Wychowawca {
    //sealed okreslamy jakie klasy beda dziedziczyły slowo permits
    private ArrayList<String> przedmioty = new ArrayList<>();


    public Nauczyciel(String imie, String nazwisko, String ...przedmioty) {
        super(imie, nazwisko);
        for(String przedmiot: przedmioty) {
            this.przedmioty.add(przedmiot);
        }
    }

    @Override
    public String toString() {
        return super.toString()  +"Nauczyciel{" +
                "przedmioty=" + przedmioty +
                "} ";
    }
}
