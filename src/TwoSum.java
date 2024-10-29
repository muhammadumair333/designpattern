public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{3,3};
        int target = 6;

        int[] resultArray = new int[2];
        int dummy;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                dummy = target - nums[i];
                if (dummy == nums[i+1]) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        System.out.println(resultArray[0] + " " + resultArray[1]);
    }
}


