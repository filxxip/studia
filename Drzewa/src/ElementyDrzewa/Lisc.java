package ElementyDrzewa;

public class Lisc extends OwocDrzewa {
//    private double pole = 0;
    public Lisc(double poczatkowe_pole){
        super(10, poczatkowe_pole);
//        zmienPole(poczatkowe_pole);
    }
    public  void rosnij(){
        wielkosc*=1.2;
    }
//    public double zwrocPole(){
//        return pole;
//    }
//    public void zmienPole(double zmiana_wartosci){
//        pole+=zmiana_wartosci;
//        if (pole<0){
//            pole = 0;
//        }
//    }
}