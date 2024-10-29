import java.util.Arrays;

public class SumArrayEasy {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        int[] nums1 = new int[]{-2, 0, 3, -5, 2, -1};
        int[] nums2 = new int[]{-2, 0, 3, -5, 2, -1};
        System.out.println(sumRange(nums, 0, 2));
        System.out.println(sumRange(nums1, 2, 5));
        System.out.println(sumRange(nums2, 0, 5));
    }

    public static int sumRange(int[] nums, int left, int right) {
        int value;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        if (left == 0)
            value = nums[right];
        else {
            value = nums[right] - nums[left-1];
        }
        return value;
    }
}
