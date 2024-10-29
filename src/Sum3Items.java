import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Items {
    public static void main(String[] args) {
        int[] nums = {-5,-3,0,2,4,6,8};
        int target = 5;
        int[] result = twoSum(nums , target);
        System.out.println(Arrays.toString(result));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        return null;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int k = numbers.length - 1;

        for (int i = 0; i < k; i++) {
            if (target - numbers[i] == numbers[k]) {
                result[0] = i + 1;
                result[1] = k + 1;
                return result;
            } else if (target - numbers[i] < numbers[k]) {
                k--;
                i--;
            }
        }

        return result;
    }
}
