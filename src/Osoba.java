public abstract class Osoba
{
    private String imie;
    private String nazwisko;
    private int wiek;
    public Osoba() {
    }
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setImie(String imie) {

        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getWiek(){
        return wiek;
    }
    public abstract double obliczWyplate();

    @Override
    public String toString() {
        return "==================================\n" + "Osoba:\n" +
                "imie= " + imie+ '\n' +
                "nazwisko= " + nazwisko + '\n' +
                "wiek= " + wiek + '\n' + "Do Wyplaty: " + obliczWyplate();
    }
}
