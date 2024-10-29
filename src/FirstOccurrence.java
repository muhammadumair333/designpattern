public class FirstOccurrence {
    public static void main(String[] args) {
        
        
    }

    public static int strStr(String haystack, String needle) {
        int indexAt =0;
        if (haystack.length() < needle.length())
            return 0;

        for(int i=0; i < needle.length(); i++){
            char c = needle.charAt(i);
            for (int j =i; j < haystack.length() ; j++){
                if(c == haystack.charAt(j)){

                }
            }
        }

        return 0;
    }
}
