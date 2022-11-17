package Drzewo;

public class Jablon extends DrzewoLisciaste implements DrzewoOwocowe2 {
    public Jablon() {
        super();
    }

    public void podlej() {
        super.podlej();
        wyhodujLiscie(50);
    }

    public void wyhodujLiscie(int ilosc) {
        wyhodujOwoce(ilosc, 3);
    }


    public void zerwijOwoc() {
        pien.zmienWytrzymalosc(0.2);
        korzen.zmienWytrzymalosc(0.2);
        for (int i = 0; i < ilosc_owocow; i++) {
            tablica_owocow_drzewa[i].zmienWytrzymalosc(1);
        }
        System.out.println("Pycha");
    }
}