import java.util.Map;

public class EqualLengthSubstring {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int cost = 3;
        System.out.println(equalSubstring(s, t, cost));
    }

    public static int equalSubstring(String s, String t, int maxCost) {

        int maxLengthSubString = 0;
        int costUsed = 0;
        int cost;
        java.util.HashMap<Integer, Integer> costMap = new java.util.HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int costing = Math.abs(t.charAt(i) - s.charAt(i));
            int count = costMap.getOrDefault(costing, 0);
            costMap.put(costing, count + 1);
        }

        System.out.println(costMap);

        for (Map.Entry<Integer, Integer> entry : costMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (costUsed == maxCost) return maxLengthSubString;

            cost = key * value;

            if (cost < maxCost - costUsed) {
                maxLengthSubString += value;
                costUsed += cost;
            } else if(cost > maxCost - costUsed){
                maxLengthSubString += cost - maxCost;
                costUsed += cost;
            }

        }

        return maxLengthSubString;
    }

}
