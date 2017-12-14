class RowColDiagonalPrint {
    public void printMatrix() {
        int size = 5, rowIndex, colIndex;
        int[][] a = new int[size][size];
        for (rowIndex = 0; rowIndex <= size - 1; rowIndex++) {

            for (colIndex = 0; colIndex <= size - 1; colIndex++) {
                /*
                 * first print the first row and first columni==0,colIndex==0
                 * print last row and last coloumn rowIndex=size-1,colIndex==size-1
                 * print principal digonal elemnts rowIndex==colIndex
                 * print opposite digonal rowIndex+colIndex==ize-1
                 */
                if (rowIndex == 0 || colIndex == 0 ||
                        rowIndex == size-1 || colIndex == size-1 ||
                        rowIndex==colIndex ||
                        rowIndex + colIndex == size-1)
                {
                    System.out.print(a[rowIndex][colIndex] + " ");

                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello Java");
        RowColDiagonalPrint instance = new RowColDiagonalPrint();
        instance.printMatrix();
    }

}