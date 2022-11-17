public class Tablica {

    public double[] tab;

    Tablica(){
        tab = new double[10];
        fill();
    }
    public  void fill(){
        for (int i =0; i<tab.length; i++){
            tab[i] = Math.random()*9+1;
        }
    }

    public  void sort(){
        final int size = tab.length;
        for (int i =0; i<size; i++){
            for (int j =1; j<size-i; j++){
                if (tab[j-1]>tab[j]){
                    double tmp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = tmp;
                }
            }
        }
    }
    public  void show(){
        for (double num : tab){
            System.out.print(num );
            System.out.print("  ");
        }
    }


}
