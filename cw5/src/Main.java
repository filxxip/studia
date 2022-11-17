public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double[][] tab1 = new double[][] {{2, 2, 2, 2, 2, 4}, {55, 11, 23, 3232, 3232, 3232}, {2, 3,4, 1, 1, 1}, {1, 12, 123, 1234, 122, 111}};
        double [][] tab2 = new double[][] {{1, 3, 5, 7}, {32, 33, 34, 44}};
        show(calc(tab2, tab1));
    }

    public static double[][] calc(double[][] mA, double [][] mB){
        int row_id = 0;
        int m = mB.length;
        int n = mA.length;
        int k = mB[0].length;
        double[][] mC = new double[n][k];
        while(row_id<n){
            int colId = 0;
            while (colId<k){
                int i= 0;
                int suma = 0;
                while(i<m){
                    suma+=mA[row_id][i] * mB[i][colId];
                    i++;
                }
                mC[row_id][colId] = suma;
                colId++;
            }
            row_id++;
        }
        return mC;
    }
    public static void show(double[][] mA) {
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[0].length; j++) {
                System.out.printf("%10.3f" + "\t", mA[i][j]);
            }
            System.out.println();
        }
    }
}