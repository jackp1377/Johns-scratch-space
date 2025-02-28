public class BaseSquare {
    int[][] mainArr;
    //int[][] countArr;
    boolean[] correctArr;
    public BaseSquare() {}
    public BaseSquare(int[][] mainArr, boolean[] correctArr) {
        this.mainArr = mainArr;
        //this.countArr = countArr;
        this.correctArr = correctArr;
    }

    public static void main(String[] args) {

        int[][] arr = new int[][] {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        //int[][] cArr = new int[arr.length][arr[0].length];
        boolean[] cArr= new boolean[3];
        BaseSquare bs = new BaseSquare(arr, cArr);

        System.out.println(bs.verify());

        BaseSquare bs2 = new BaseSquare();

        bs2.genOdd(5);
        System.out.println(bs2.verify());
        bs2.printArr(bs2.mainArr);
        bs2.genOdd(9);
        System.out.println(bs2.verify());
        bs2.printArr(bs2.mainArr);
    }

    public boolean verify() {
        if (rowCheck() && colCheck() && countCheck() && diagCheck()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean countCheck() {

        for (int i = 1; i < mainArr.length * mainArr.length; i++) {
            if (!searchCount(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean searchCount(int s) {
        for(int i = 0; i < mainArr.length; i++) {
            for(int j = 0; j < mainArr[0].length; j++) {
                //System.out.println(mainArr[i][j]);
                if (mainArr[i][j] == s) {
                    //System.out.println(s);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean rowCheck() {
        int total[] = new int[mainArr.length];
        for (int i = 0; i < mainArr.length; i++) {
            total[i] = 0;
            for (int j = 0; j < mainArr[0].length; j++) {
                total[i] += mainArr[i][j];
            }
        }

        int ref = total[0];
        for (int i = 0; i < total.length; i++) {
            //System.out.println(total[i]);
            if (total[i] != ref) {
                return false;
            }
        }
        return true;
    }

    public boolean colCheck() {
        int total[] = new int[mainArr[0].length];
        for (int i = 0; i < mainArr.length; i++) {
            //total[i] = 0;
            for (int j = 0; j < mainArr[0].length; j++) {
                total[i] += mainArr[j][i];
            }
        }

        int ref = total[0];
        for (int i = 0; i < total.length; i++) {
            //System.out.println(total[i]);
            if (total[i] != ref) {
                return false;
            }
        }

        return true;
    }

    public boolean diagCheck() {
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < mainArr.length; i++) {
            for (int j = 0; j < mainArr[0].length; j++) {
                if (i == j) {
                    diag1 += mainArr[i][j];
                }
                if (i == (mainArr.length - 1) - j) {
                    //System.out.println(mainArr[i][j]);
                    diag2 += mainArr[i][j];
                }
            }
        }

        //System.out.println(diag1);
        //System.out.println(diag2);
        if (diag1 != diag2) {
            return false;
        }
        return true;
    }


    public BaseSquare genOdd(int n) {
        BaseSquare bs = new BaseSquare();
        int[][] oddArr = new int[n][n];
        int rowPtr = n - 1;
        int colPtr = n/2;

        for (int i = 0; i < oddArr.length; i++) {
            for (int j = 0; j < oddArr[0].length; j++) {
                oddArr[i][j] = 0;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            int storeRow = rowPtr;
            int storeCol = colPtr;

            oddArr[rowPtr][colPtr] = i;
            //System.out.println(oddArr[rowPtr][colPtr] + " " + rowPtr + " " + colPtr);
            rowPtr += 1;
            colPtr += 1;

            if (rowPtr == n) {
                rowPtr = 0;
            }
            if (colPtr == n) {
                colPtr = 0;
            }
            //System.out.println(oddArr[rowPtr][colPtr] + " " + rowPtr + " " + colPtr);

            if (oddArr[rowPtr][colPtr] != 0) {
                //System.out.println(oddArr[storeRow][storeCol]);
                rowPtr = storeRow;
                colPtr = storeCol;
                rowPtr = rowPtr - 1;
            }




        }

        mainArr = oddArr.clone();
        return bs;
    }

    void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
