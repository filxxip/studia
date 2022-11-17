public class Tablica {

    private double[][] tab;

    Tablica(int start, int end) {
        tab = new double[10][];
        fill(start, end);
    }

    public void sort() {
        for (int i = 0; i < tab.length; i++) {
            sort(tab[i]);
        }
    }

    private void sort(double[] board) {
        final int size = board.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (board[j - 1] > board[j]) {
                    double tmp = board[j - 1];
                    board[j - 1] = board[j];
                    board[j] = tmp;
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

    public void fill(int start, int end) {
        if (end < start) {
            end = start;
        }
        for (int i = 0; i < tab.length; i++) {
            int cols = (int) (Math.random() * (end - start)) + start;
            tab[i] = new double[cols];
            fill(tab[i]);
        }
    }

}
