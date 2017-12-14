class RowColDiagonalPrint {

    /*
     *
     */
    public void printMatrix() {
        int size = 5, i, j;
//        int[][] multiples = new int[3][3]
        int[][] a = new int[size][size];
//        String[][] a = {{"*", "*", "*"}, {"*", "*", "*"}, {"*", "*", "*"}};
        for (i = 0; i <= size - 1; i++) {
            for (j = 0; j <= size - 1; j++) {
                if (i == 0 || j == 0 || i == size-1 || j == size-1 || i==j || i + j == size-1) {
                    System.out.print(a[i][j] + " ");

                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello Java");
        RowColDiagonalPrint instance1 = new RowColDiagonalPrint();
        instance1.printMatrix();
    }

}