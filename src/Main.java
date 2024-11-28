public class Main {
    public static void main(String[] args) {
        System.out.println("Getery i Setery!");


        Pracownik p1 = new Pracownik();
        p1.setImie("Kamil");
        p1.setNazwisko("Zdrenka");
        p1.setWiek(30);
        p1.setNumer("123");
        System.out.println(p1);

        PracownikZmianowy pz1= new PracownikZmianowy("Marcin","Olejnik",40,15);
        System.out.println(pz1);
        PracownikZmianowy pz2= new PracownikZmianowy();
        pz2.setImie("Pawel");
        pz2.setNazwisko("Zagrodzki");
        pz2.setWiek(35);
        pz2.setLiczbaZmian(5);
        System.out.println(pz2);


    }
}