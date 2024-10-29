import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HashMap<I extends Number, I1 extends Number> {

    public static void main(String[] args) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        Integer minKey = null;
        Integer maxValue = Integer.MIN_VALUE;

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(2);

        for (int number : arr) {
            int count = map.getOrDefault(number, 0);
            map.put(number, count +1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                minKey = key;
            } else if (value.equals(maxValue) && (minKey == null || key < minKey)) {
                minKey = key;
            }

        }


        System.out.println(minKey);

    }
}
