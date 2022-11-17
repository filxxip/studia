import Drzewo.Sosna;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sosna sosna = new Sosna();
        sosna.zwrocOgolnyStan();
        sosna.wyhodujIgly(50);
        sosna.stworzJedzenie(40);
        sosna.podlej();
        sosna.zwrocOgolnyStan();

    }
}