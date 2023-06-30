import java.util.*;
public class arr2D8 {

    public static int[] realArr(int[] changed) {
        int l=changed.length;
        if (l % 2 != 0) {
            return new int[0]; 
        }

        Arrays.sort(changed);
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int real[] = new int[l / 2];
        int index = 0;

        for (int n : changed) {
            if (countMap.containsKey(n) && countMap.get(n) > 0) {
                int doubleNum = n * 2;
                if (!countMap.containsKey(doubleNum) || countMap.get(doubleNum) == 0) {
                    return new int[0]; 
                }
                real[index] = n;
                countMap.put(n, countMap.get(n) - 1);
                countMap.put(doubleNum, countMap.get(doubleNum) - 1);
                index++;
            }
        }

        return real;
    }

    public static void main(String[] args) {
        int changed[] = {1, 3, 4, 2, 6, 8};
        int real[] = realArr(changed);

        if (real.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < real.length - 1; i++) {
                System.out.print(real[i] + ",");
            }
            System.out.println(real[real.length - 1] + "]");
        }
    }
}
