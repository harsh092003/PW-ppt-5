import java.util.Arrays;
public class arr2D{
    public static int[][] array2D(int[] original, int m, int n) {
        int l=original.length;
        if (l != m * n) {
            return new int[0][0];
        }       
        int ar2d[][] = new int[m][n];
        
        for (int i = 0; i < l; i++) {
            int row = i / n;
            int col = i % n;
            ar2d[row][col] = original[i];
        }  
        return ar2d;
    }   public static void main(String[] args) {
        int original[] = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int output[][] = array2D(original, m, n);    
        System.out.println(Arrays.deepToString(output));
    }
}

   