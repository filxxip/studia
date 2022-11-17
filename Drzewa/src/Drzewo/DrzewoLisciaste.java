package Drzewo;

import ElementyDrzewa.Igla;
import ElementyDrzewa.OwocDrzewa;

public abstract class DrzewoLisciaste extends Drzewo {
    public DrzewoLisciaste(double poczatkowa_wysokosc, double objetosc_korzenia, int wytrzymalosc, int ilosc_igiel) {
        super(poczatkowa_wysokosc, objetosc_korzenia, wytrzymalosc);
        initTablica(ilosc_igiel,2000, 0.1 );
    }


    public DrzewoLisciaste() {
        super();
        initTablica(0,2000, 0.1 );
    }


    public void podlej() {
        super.podlej();
        korzen.zmienObjetosc(1);
        korzen.zmienWytrzymalosc(7);
        pien.zmienWytrzymalosc(5);
        pien.zmienWysokosc(0.5);
        for (int i = 0; i < ilosc_owocow; i++) {
            tablica_owocow_drzewa[i].rosnij();
            tablica_owocow_drzewa[i].zmienWytrzymalosc(6);
        }
    }

    public abstract void wyhodujLiscie(int ilosc);


    protected OwocDrzewa wyhodujOwoc(double dlugosc) {
        return new Igla(dlugosc);

    }

    protected OwocDrzewa[] stworzTabliceOwocow(double miejsce_w_tablicy) {
        return new Igla[2000];
    }

    public void stworzJedzenie(int temperatura) {
        if (temperatura > 5) {
            System.out.println("Tworze jedzenie am am am");
            korzen.zmienObjetosc(0.5);
            korzen.zmienWytrzymalosc(15);
            pien.zmienWytrzymalosc(15);
            pien.zmienWysokosc(1);
            for (int i = 0; i < ilosc_owocow; i++) {
                tablica_owocow_drzewa[i].zmienWytrzymalosc(5);
            }
        } else {
            System.out.println("Jestem glodny");
            korzen.zmienWytrzymalosc(-20);
            pien.zmienWytrzymalosc(-20);
            for (int i = 0; i < ilosc_owocow; i++) {
                tablica_owocow_drzewa[i].zmienWytrzymalosc(-3);
            }
        }
    }

}
