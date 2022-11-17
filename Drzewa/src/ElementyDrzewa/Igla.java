package ElementyDrzewa;

public class Igla extends OwocDrzewa {
//    private double dlugosc  =0;
//    private double ostrosc = 0;

    public Igla(double poczatkowa_dlugosc) {
        super(30, poczatkowa_dlugosc);
//        zmienDlugosc(poczatkowa_dlugosc);
//        zmienOstrosc(poczatkowa_ostrosc);
    }

    public void rosnij() {
        System.out.println("xxx");
        wielkosc *= 1.1;
        zmienWytrzymalosc(-2);
    }

//    public double zwrocOstrosc() {
//        return ostrosc;
//    }
//
//    public double zwrocDlugosc() {
//        return dlugosc;
//    }
//
//    public void zmienDlugosc(double delta_wartosc) {
//        dlugosc += delta_wartosc;
//        if(dlugosc<0){
//            dlugosc = 0;
//        }
//    }
//
//    public void zmienOstrosc(double delta_wartosc) {
//        ostrosc += delta_wartosc;
//        if(ostrosc<0){
//            ostrosc = 0;
//        }
//    }

}