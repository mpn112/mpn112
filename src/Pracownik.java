public class Pracownik extends Osoba
{
    private String numer;
    public Pracownik(String imie, String nazwisko, int wiek, String numer)
    {
        super(imie, nazwisko, wiek);
        this.numer = numer;
    }
    public Pracownik(){
    }


    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getNumer() {
        return numer;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nnumer=" + numer;
    }

    @Override
    public double obliczWyplate() {
        ParametryFinansowe parametry = new ParametryFinansowe();
        return parametry.GetWyplataPracownika()*20;
    }
}
