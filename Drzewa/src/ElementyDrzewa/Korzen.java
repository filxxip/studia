package ElementyDrzewa;

public class Korzen extends ElementDrzewa {
    private double zajmowana_objetosc = 0;
    public Korzen(double poczatkowa_objetosc, int poczatkowa_wytrzmalosc){
        super(poczatkowa_wytrzmalosc);
        zmienObjetosc(poczatkowa_objetosc);
    }

    public void zmienObjetosc(double zmiana){
        zajmowana_objetosc+=zmiana;
        if(zajmowana_objetosc<0){
            zajmowana_objetosc = 0;
        }
    }
    public double zwrocObjetosc(){return zajmowana_objetosc;}
}