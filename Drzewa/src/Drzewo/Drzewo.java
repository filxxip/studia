package Drzewo;


import ElementyDrzewa.*;

public abstract class Drzewo {

    protected double wysokosc;
    protected Korzen korzen;
    protected Pien pien;

    OwocDrzewa[] tablica_owocow_drzewa;
    int ilosc_owocow;

    public Drzewo() {
        wysokosc = 1;
        korzen = new Korzen(1, 10);
        pien = new Pien(10, 0.6, 0.1);
    }

    public Drzewo(double poczatkowa_wysokosc, double objetosc_korzenia, int wytrzymalosc) {
        wysokosc = poczatkowa_wysokosc;
        korzen = new Korzen(objetosc_korzenia, wytrzymalosc);
        pien = new Pien(wytrzymalosc, (poczatkowa_wysokosc * 0.6), (poczatkowa_wysokosc * 0.1));
    }

    protected void initTablica(int ilosc, int miejsce_w_tablicy, double wielkosc_poczatkowa_owocu) {
        tablica_owocow_drzewa = stworzTabliceOwocow(miejsce_w_tablicy);
        ilosc_owocow = ilosc;

        for (int i = 0; i < miejsce_w_tablicy; i++) {
            if (i >= ilosc_owocow) {
                tablica_owocow_drzewa[i] = null;
            } else {
                tablica_owocow_drzewa[i] = wyhodujOwoc(wielkosc_poczatkowa_owocu);
            }
        }
    }

    public void podlej() {
        System.out.println("Wykonuje podlewanie roslinki.");
    }


    private double getSredniStan() {
        double stan_igiel = 0;
        double podstawowy_sredni_stan = korzen.zwrocWytrzymalosc() * 0.5 + pien.zwrocWytrzymalosc() * 0.5;
        for (int i = 0; i < ilosc_owocow; i++) {
            stan_igiel += tablica_owocow_drzewa[i].zwrocWytrzymalosc();
        }

        return ilosc_owocow > 0 ? 0.7 * podstawowy_sredni_stan + 0.3 * stan_igiel / ilosc_owocow : 0.7 * podstawowy_sredni_stan;
    }

    public abstract void stworzJedzenie(int temperatura);
    protected abstract OwocDrzewa wyhodujOwoc(double wielkosc);
    protected abstract OwocDrzewa[] stworzTabliceOwocow(double miejsce_w_tablicy);

    protected void dodajOwocDrzewaDoTablicy(OwocDrzewa owoc){
        tablica_owocow_drzewa[ilosc_owocow] = owoc;
        ilosc_owocow++;
    }

    protected void wyhodujOwoce(int ilosc, double wielkosc) {
        for (int i = 0; i < ilosc; i++) {
            OwocDrzewa owoc = wyhodujOwoc(wielkosc);
            System.out.println(owoc.getClass().getName());
            dodajOwocDrzewaDoTablicy(owoc);
        }
    }

    public double zwrocWysokosc() {
        return wysokosc;
    }

    protected void zmienWysokosc(double zmiana) {
        wysokosc += zmiana;
        if (wysokosc < 0) {
            wysokosc = 0;
        }
    }

    public void zwrocOgolnyStan() {
        System.out.println("Drzewo : " + this.getClass().getSimpleName());
        System.out.println("    wysokosc: " + zwrocWysokosc());
        System.out.println("    ogolny stan: " + getSredniStan() + "%");
        System.out.println("    typ owocu drzewa: "+wyhodujOwoc(0).getClass().getSimpleName());
        System.out.println("    ilosc owocow drzewa: " + ilosc_owocow);
        System.out.println("    srednia wielkosc: " + zwrocSredniaWielkoscOwocow());
    }

    private double zwrocSredniaWielkoscOwocow() {
        double stan_igiel = 0;

        for (int i = 0; i < ilosc_owocow; i++) {
            stan_igiel += tablica_owocow_drzewa[i].zwrocWielkosc();
        }
        return ilosc_owocow > 0 ? (stan_igiel / ilosc_owocow) : stan_igiel;
    }



}
