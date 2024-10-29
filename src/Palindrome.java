public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeString(1224422451));
    }
        public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        long temp = x;
        long dummy;
        long reversed = 0;

        while(temp != 0){
            dummy = temp % 10;
            reversed = reversed * 10 + dummy;
            temp = temp / 10;
        }

        return (reversed == x);

    }


    public static boolean isPalindromeString(int x) {

        if(x < 0)
            return false;
        String nums = Integer.toString(x);
        int length = nums.length();

        for (int i=0; i< length ; i++){
            if(nums.charAt(i) != nums.charAt(length-(i+1)))
                return false;
        }
        return true;
    }
}
