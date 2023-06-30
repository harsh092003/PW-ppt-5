import java.util.*;
public class arr2D4 {
    public static List<List<Integer>> distinct(int num1[], int num2[]) {
        Set<Integer>s1 = new HashSet<>();
        Set<Integer>s2 = new HashSet<>();
        for (int num : num1) {
            s1.add(num);
        }
        for (int num : num2) {
            s2.add(num);
        }
        List<Integer> notIn2 = new ArrayList<>();
        List<Integer> notIn1 = new ArrayList<>();

        for (int num : num1) {
            if (!s2.contains(num)) {
                notIn2.add(num);
            }
        }
        for (int num : num2) {
            if (!s1.contains(num)) {
                notIn1.add(num);
            }
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(notIn2);
        answer.add(notIn1);
        return answer;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = distinct(nums1, nums2);
        System.out.println(result);
    }
}

