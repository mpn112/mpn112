public class PracownikZmianowy extends Osoba
{
    private double liczbaZmian;
    public PracownikZmianowy(String imie, String nazwisko, int wiek, double liczbaZmian)
    {
        super(imie,nazwisko,wiek);
        this.liczbaZmian = liczbaZmian;
    }
    public PracownikZmianowy()
    {
    }

    public void setLiczbaZmian(int liczbaZmian) {
        this.liczbaZmian = liczbaZmian;
    }
    public double getLiczbaZmian() {
        return liczbaZmian;
    }

    public void setLiczbaZmian(double liczbaZmian) {
        this.liczbaZmian = liczbaZmian;
    }



    @Override
    public double obliczWyplate()
    {
        ParametryFinansowe parametry = new ParametryFinansowe();
        return parametry.GetWyplataPracownikaZmianowego()*liczbaZmian;
    }


}
