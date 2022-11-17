package ElementyDrzewa;

public class Pien extends ElementDrzewa {
    private double wysokosc = 0;
    private double grubosc = 0;

    public Pien(int poczatkowa_wytrzymalosc, double poczatkowa_grubosc, double poczatkowa_wysokosc) {
        super(poczatkowa_wytrzymalosc);


    }

    public void zmienGrubosc(double zmiana_wartosci) {
        grubosc += zmiana_wartosci;
        if (grubosc < 0) {
            grubosc = 0;
        }
    }

    public void zmienWysokosc(double zmiana_wartosci) {
        wysokosc += zmiana_wartosci;
        if (wysokosc < 0) {
            wysokosc = 0;
        }
    }

    public double zwrocWysokosc() {
        return wysokosc;
    }

    public double zwrocGrubosc() {
        return grubosc;
    }
}
