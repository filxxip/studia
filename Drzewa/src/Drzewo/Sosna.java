package Drzewo;

public class Sosna extends DrzewoIglaste {
    public Sosna() {
        super();
    }

    public void podlej(){
        super.podlej();
        wyhodujIgly(20);
    }


    public void wyhodujIgly(int ilosc){
        wyhodujOwoce(ilosc, 5);
    }

}