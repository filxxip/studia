package ElementyDrzewa;

public class Igla extends OwocDrzewa {
//    private double dlugosc  =0;
//    private double ostrosc = 0;

    public Igla(double poczatkowa_dlugosc) {
        super(30, poczatkowa_dlugosc);
    }

    public void rosnij() {
        System.out.println("xxx");
        wielkosc *= 1.1;
        zmienWytrzymalosc(-2);
    }


}