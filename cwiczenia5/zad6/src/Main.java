public class Main {
    public static void main(String[] args) {
        Macierz m = new Macierz(3);
        m.fill();
        m.show();
        System.out.println(m.isZwrotna());
        System.out.println(m.isnotZwrotna());
        System.out.println(m.isSymetryczna());
        System.out.println(m.isnotSymetryczna());
    }
}