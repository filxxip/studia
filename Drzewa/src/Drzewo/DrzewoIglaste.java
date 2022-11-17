package Drzewo;

import ElementyDrzewa.Igla;
import ElementyDrzewa.OwocDrzewa;

public abstract class DrzewoIglaste extends Drzewo {
    public DrzewoIglaste(double poczatkowa_wysokosc, double objetosc_korzenia, int wytrzymalosc, int ilosc_igiel) {
        super(poczatkowa_wysokosc, objetosc_korzenia, wytrzymalosc);
        initTablica(ilosc_igiel,2000, 0.1 );
    }


    public DrzewoIglaste() {
        super();
        initTablica(0,2000, 0.1 );
    }


    public void podlej() {
        super.podlej();
        korzen.zmienObjetosc(0.5);
        korzen.zmienWytrzymalosc(5);
        pien.zmienWytrzymalosc(3);
        pien.zmienWysokosc(0.3);
        for (int i = 0; i < ilosc_owocow; i++) {
            tablica_owocow_drzewa[i].rosnij();
            tablica_owocow_drzewa[i].zmienWytrzymalosc(5);
        }
    }

    public abstract void wyhodujIgly(int ilosc);


    protected OwocDrzewa wyhodujOwoc(double dlugosc) {
        return new Igla(dlugosc);

    }

    protected OwocDrzewa[] stworzTabliceOwocow(double miejsce_w_tablicy) {
        return new Igla[2000];
    }

    public void stworzJedzenie(int temperatura) {
        if (temperatura > 5) {
            System.out.println("Tworze jedzenie am am am");
            korzen.zmienObjetosc(0.2);
            korzen.zmienWytrzymalosc(10);
            pien.zmienWytrzymalosc(10);
            pien.zmienWysokosc(0.1);
            for (int i = 0; i < ilosc_owocow; i++) {
                tablica_owocow_drzewa[i].zmienWytrzymalosc(3);
            }
        } else {
            System.out.println("Jestem glodny");
            korzen.zmienWytrzymalosc(-10);
            pien.zmienWytrzymalosc(-10);
            for (int i = 0; i < ilosc_owocow; i++) {
                tablica_owocow_drzewa[i].zmienWytrzymalosc(-1);
            }
        }
    }

}
