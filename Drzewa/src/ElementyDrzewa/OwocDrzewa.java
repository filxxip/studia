package ElementyDrzewa;

public abstract class OwocDrzewa extends ElementDrzewa {
    double wielkosc;

    OwocDrzewa(double poczatkowa_wytrzymalosc, double poczatkowa_wielkosc) {
        super(poczatkowa_wytrzymalosc);
        zmiencWielkosc(poczatkowa_wielkosc);
    }

    public void spadnij() {
        System.out.println("Spadam sobie...");
    }

    public double zwrocWielkosc() {
        return wielkosc;
    }

    public void zmiencWielkosc(double delta_wartosc) {
        wielkosc += delta_wartosc;
        if (wielkosc < 0) {
            wielkosc = 0;
        }
    }

    public abstract void rosnij();

}
