import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public class SubsequenceOfLength {

    public static void main(String[] args) {

        int[] nums1 = {2, 1, 3, 3};
        myClass c = new myClass();
        c.maxSubsequence(nums1, 2);
    }
}

class myClass {
    public int[] maxSubsequence(int[] nums, int k) {

        int[] result = new int[k];
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();


        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, count + 1);
        }

        for (int i = 0; i < k; i++) {

        }
        //System.out.println(map);

        return null;
    }
}
