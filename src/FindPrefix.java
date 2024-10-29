public class FindPrefix {

    public static void main(String[] args) {
        String[] words = new String[]{"leetcode","win","loops","success"};
        String pref = "code";

        System.out.println(prefixCount(words, pref));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref))
                count++;
        }
        return count;
    }
}
