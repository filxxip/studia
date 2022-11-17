public class Tablica {
    private double[][] tab;

    Tablica() {
        tab = new double[10][20];
        fill();
    }

    public void sort() {
        final int cols = tab[0].length;
        final int rows = tab.length;
        for (int k = 0; k < cols; k++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 1; j < rows - i; j++) {
                    if (tab[j - 1][k] > tab[j][k]) {
                        double tmp = tab[j - 1][k];
                        tab[j - 1][k] = tab[j][k];
                        tab[j][k] = tmp;
                    }
                }
            }
        }
    }

    private void show(double[] board) {
        for (double num : board) {
            System.out.print(num);
            System.out.print("  ");
        }
    }

    public void show() {
        for (double[] num : tab) {
            show(num);
            System.out.println();
        }
    }

    private void fill(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Math.random() * 9 + 1;
        }
    }

    public void fill() {
        for (int i = 0; i < tab.length; i++) {
            fill(tab[i]);
        }
    }
}
