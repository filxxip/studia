public class DoubleArray {
    private int[] tab1;
    private int[] tab2;

    enum Index {FIRST, SECOND}

    DoubleArray() {
        tab1 = new int[10];
        tab2 = new int[10];
        fill();

    }

    private void fill(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public void fill() {
        fill(tab1);
        fill(tab2);
    }

    public int check() {
        int number = 0;
        for (int i = 0; i < tab1.length; i++) {
            if (isDivisible(tab1[i], tab2)) {
                number++;
            }
        }
        return number;
    }

    private boolean isDivisible(int value, int[] tab) {
        int num = 0;
        for (int i = 0; i < tab.length; i++) {
            if (value % tab[i] == 0) {
                num++;
            }
            if (num == 3) {
                return true;
            }
        }
        return false;
    }

    private void show(int[] board) {
        for (double num : board) {
            System.out.print(num);
            System.out.print("  ");
        }
        System.out.println();
    }

    public void show(Index index) {
        switch (index) {
            case FIRST: {
                show(tab1);
                break;
            }
            case SECOND: {
                show(tab2);
                break;
            }
        }

    }
}

