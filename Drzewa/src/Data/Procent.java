package Data;

public class Procent {
    private double wartosc;

    public Procent(double wartosc_poczatkowa) {
        if (jestWartoscPrawidlowa(wartosc_poczatkowa)) {
            wartosc = wartosc_poczatkowa;
        } else {
            wartosc = 50;
        }
    }

    public void zmien(double zmiana) {
        ustawWartosc(wartosc + zmiana);
    }

    private boolean jestWartoscPrawidlowa(double nowa_wartosc) {
        return nowa_wartosc <= 100 && nowa_wartosc >= 0;
    }

    public double zwrocWartosc() {
        return wartosc;
    }

    public void ustawWartosc(double nowa_wartosc) {
        if (jestWartoscPrawidlowa(nowa_wartosc)) {
            wartosc = nowa_wartosc;
        }
        if (nowa_wartosc > 100) {
            wartosc = 100;
        }
        if (nowa_wartosc < 0) {
            wartosc = 0;
        }
    }

}
