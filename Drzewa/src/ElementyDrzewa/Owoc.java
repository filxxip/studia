//package ElementyDrzewa;
//
//public class Owoc extends OwocDrzewa {
//
//    private double objetosc;
//    private double slodkosc;
//
//    public Owoc( double poczatkowa_slodkosc, double poczatkowa_objetosc) {
//        super(10);
//        objetosc = poczatkowa_objetosc;
//        slodkosc = poczatkowa_slodkosc;
//        if (slodkosc < 0) {
//            slodkosc = 0;
//        }
//        if (objetosc < 0) {
//            objetosc = 0;
//        }
//    }
//
//    public Owoc(Owoc another){
//        super(10);
//        this.objetosc = another.objetosc;
//        this.slodkosc = another.slodkosc;
//    }
//
//    public double zwrocSlodkosc() {
//        return slodkosc;
//    }
//
//    public double zwrocObjectosc() {
//        return objetosc;
//    }
//
//    public void zmienSlodkosc(double zmiana) {
//        slodkosc += zmiana;
//        if (slodkosc < 0) {
//            slodkosc = 0;
//        }
//    }
//
//    public void zmienObjetosc(double zmiana) {
//        objetosc += zmiana;
//        if (objetosc < 0) {
//            objetosc = 0;
//        }
//    }
//
//}
