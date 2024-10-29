import java.util.ArrayList;
import java.util.Arrays;

import static java.awt.SystemColor.window;

public class MaximumAverageSubArray {

    public static void main (String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        ArrayList<Integer> window = new ArrayList<>(Arrays.asList(Arrays.stream(
                Arrays.copyOf(nums, k)).boxed().toArray(Integer[]::new)));

        double maxSumAverage = window.stream().mapToDouble(Integer::doubleValue).sum() / k;

        for (int i = k ; i < nums.length; i++){
           maxSumAverage = findMaxSumWindowArray(window, maxSumAverage, nums[i]);
        }
        return maxSumAverage;
    }

    public static double findMaxSumWindowArray(ArrayList<Integer> array, double maxSum, int value){
        array.remove(0);
        array.add(value);
        double maxSumAverage = array.stream().mapToDouble(Integer::doubleValue).sum() / array.size();

        return Math.max(maxSumAverage, maxSum);
    }
}
