public class arr2D5 {
    public static int distant(int num1[], int num2[], int d) {
        int distance = 0;
        for (int n1 : num1) {
            boolean ans = true;
            for (int n2 : num2) {
                if (Math.abs(n1-n2) <= d) {
                    ans = false;
                    break;
                }
            }
            if (ans) {
                distance++;
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        int num1[] = {4, 5, 8};
        int num2[] = {10, 9, 1, 8};
        int d = 2;
        int output = distant(num1, num2, d);
        System.out.println(output);
    }
}


