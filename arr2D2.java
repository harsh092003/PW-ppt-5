public class arr2D2 {
    public static int arrange(int n) {
        int rowNo = 0;
        for (int row = 1; row <= n; row++) {
            n -= row;
            rowNo++;
            if (n < row) {
                break;
            }
        }
        return rowNo;
    }

    public static void main(String[] args) {
        int n = 5;
        int rowCount = arrange(n);
        System.out.println(rowCount);
    }
}

    
