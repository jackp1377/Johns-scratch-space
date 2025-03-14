import java.util.ArrayList;

public class ArrListSquare {
    ArrayList<ArrayList<Integer>> arr;
    BaseSquare bs;
    int width;
    public ArrListSquare(int l) {
        width = l;
        arr = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < l; i++) {
            this.arr.add(new ArrayList<Integer>());
            for (int j = 0; j < l; j++) {
                this.arr.get(i).add(j);
            }
        }

        bs = new BaseSquare();
        bs.mainArr = new int[l][l];
        this.alToArray();

    }

    public static void main(String[] args) {
        ArrListSquare l = new ArrListSquare(4);
        int[][] arr1 = new int[][] {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        l.bs.mainArr = arr1;

        l.arrayToAL();
        l.toString();

        System.out.println(l.verify());

        ArrListSquare l2 = new ArrListSquare(7);
        l2.genArr();
        l2.toString();

    }

    public String toString() {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return "";
    }

    public void alToArray() {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                bs.mainArr[i][j] = arr.get(i).get(j);
            }
        }
    }

    public void arrayToAL() {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                arr.get(i).set(j, bs.mainArr[i][j]);
            }
        }
    }

    public Boolean verify() {
        this.alToArray();
        return bs.verify();
    }

    public void genArr() {
        bs.genOdd(width);
        this.arrayToAL();
    }
}
