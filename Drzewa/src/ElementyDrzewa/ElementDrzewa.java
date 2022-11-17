package ElementyDrzewa;

import Data.Procent;

public abstract class ElementDrzewa {

    protected Procent wytrzymalosc;

    ElementDrzewa(double poczatkowa_wytrzymalosc) {
        wytrzymalosc = new Procent(poczatkowa_wytrzymalosc);
    }

    public double zwrocWytrzymalosc() {
        return wytrzymalosc.zwrocWartosc();
    }

    public void zmienWytrzymalosc(double wartosc_zmiany) {
        wytrzymalosc.zmien(wartosc_zmiany);
    }

}
