//package Drzewo;
//
//import ElementyDrzewa.Lisc;
//import ElementyDrzewa.Owoc;
//
//public abstract class DrzwoOwocowe extends DrzewoLisciaste{
//
//    private Owoc[] tablica_owocow;
//    private int ilosc_owocow = 0;
//
//    public DrzwoOwocowe(double poczatkowa_wysokosc, double objetosc_korzenia, int wytrzymalosc, int poczatkowa_ilosc_owocow, Owoc przykladowy_owoc) {
//        super(poczatkowa_wysokosc, objetosc_korzenia, wytrzymalosc, poczatkowa_ilosc_owocow*3);
//        tablica_owocow = new Owoc[200];
//        ilosc_lisci_na_drzewie = poczatkowa_ilosc_owocow;
//
//        for (int i = 0; i < 200; i++) {
//            if (i >= ilosc_lisci_na_drzewie) {
//                tablica_owocow[i] = null;
//            } else {
//                tablica_owocow[i] = przykladowy_owoc;
//            }
//        }
//    }
//
//    DrzwoOwocowe(){
//        super();
//        tablica_owocow = new Owoc[200];
//
//        for (int i = 0; i < 200; i++) {
//            tablica_owocow[i] = null;
//        }
//    }
//    public abstract void wyhodujOwoce(int ilosc);
//
//    protected void wyhodujOwoce(int ilosc, double slodkosc, double objetosc) {
//        for (int i = 0; i < ilosc; i++) {
//            wyhodujOwoc(objetosc, slodkosc);
//        }
//    }
//
//    private void wyhodujOwoc(double slodkosc, double objetosc) {
//        tablica_owocow[ilosc_lisci_na_drzewie] = new Owoc(objetosc, slodkosc);
//        ilosc_owocow++;
//    }
//
//}
