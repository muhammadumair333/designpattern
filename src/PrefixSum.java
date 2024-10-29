public class PrefixSum {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int subArrayLength = 1;
        int previous = nums[0];
        prefix[0] = 1;

        for (int i = 1; i < length; i++) {
            if (previous == nums[i]) {
            }
        }
        return subArrayLength;
    }
}
