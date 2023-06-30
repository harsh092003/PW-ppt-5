import java.util.*;
public class arr2D3 {
    public static void main(String args[]){
        int nums[]={-4,-1,0,3,10};
        int output[]=sortedSquare(nums);
        System.out.println(Arrays.toString(output));
    }
    public static int[] sortedSquare(int nums[]){
        int output[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = output.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                output[index] = nums[left] * nums[left];
                left++;
            } else {
                output[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
      return output;
    }
}

