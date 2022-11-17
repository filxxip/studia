import java.util.Random;

public class Macierz {
    private int[][] tab;

    Macierz(int size) {
        if (size != 0) {
            tab = new int[size][size];
        } else {
            tab = new int[1][1];
        }
    }

    public void fill() {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = random.nextInt(2);
            }
        }
    }

    public void show() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean isZwrotna() {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][i]!=1){
                return false;
            }
        }
        return true;
    }
    public boolean isnotZwrotna() {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][i]==1){
                return false;
            }
        }
        return true;
    }

    public boolean isSymetryczna(){
        for (int i = 0; i<tab.length-1; i++){
            for (int j = i+1; j<tab.length; j++){
                if (tab[i][j]!=tab[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isnotSymetryczna(){
        for (int i = 0; i<tab.length-1; i++){
            for (int j = i+1; j<tab.length; j++){
                if (tab[i][j]==tab[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

}
