public class MountainTriplet {

    public static void main(String[] args) {

        int[] nums1 = {8, 6, 1, 5, 3};
        int[] nums2 = {5, 4, 8, 7, 10, 2};
        int[] nums3 = {6, 5, 4, 3, 4, 5};

        System.out.println(minimumSum(nums1));
        //System.out.println(minSum(nums2));
        //System.out.println(minSum(nums3));

    }

    public static int minSum(int[] nums) {

        int minSum = 1000000000;
        int actualMontainSum = 0;
        boolean upwardTrendDone = false;
        boolean downwardTrend = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (!upwardTrendDone && nums[i] < nums[j] && j != nums.length - 1) {
                    actualMontainSum = nums[i] + nums[j];
                    if (minSum > actualMontainSum) {
                        minSum = actualMontainSum;
                    }

                    if (i == nums.length - 3) {
                        upwardTrendDone = true;
                        break;
                    }

                }
                if (upwardTrendDone && nums[i] > nums[j]) {
                    actualMontainSum += nums[j];
                    minSum += nums[j];
                    downwardTrend = true;
                }

            }

        }
        if (upwardTrendDone && downwardTrend) return minSum;
        else return -1;
    }


    public static int minimumSum(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.min(left[i - 1], nums[i]);
        }

        right[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.min(right[i + 1], nums[i]);
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (left[i] < nums[i] && right[i] < nums[i]) min = Math.min(left[i] + right[i] + nums[i], min);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
