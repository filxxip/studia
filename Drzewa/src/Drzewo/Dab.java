package Drzewo;

public class Dab extends DrzewoLisciaste {
    public Dab() {
        super();
    }

    public void podlej() {
        super.podlej();
        wyhodujLiscie(50);
    }

    public void wyhodujLiscie(int ilosc) {
        wyhodujOwoce(ilosc, 3);
    }


}