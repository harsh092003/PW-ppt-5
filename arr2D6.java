import java.util.*;
public class arr2D6{
    public static List<Integer> same(int nums[]) {
        List<Integer> output = new ArrayList<>();
        for (int n : nums) {
            int index = Math.abs(n) - 1;
            if (nums[index] < 0) {
                output.add(Math.abs(n));
            } else {
                nums[index] = -nums[index];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = same(nums);
        System.out.println(duplicates);
    }
}

    