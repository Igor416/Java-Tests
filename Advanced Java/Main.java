import java.util.*;
//import java.util.Map.Entry;

public class Main {
    public static Bank bank = new Bank();
    public static boolean Performing = true;
    public static void main(String[] args) {
        /*
        String[] words = new String[] {"tuk", "kut", "time"};
        for (Entry<Integer, List<String>> i : convert(words).entrySet()) {
            System.out.print(i.getKey() + ": ");
            for (String word : i.getValue()) {
                System.out.print(word);
                System.out.print(", ");
            }
            System.out.println();
        }
        */
        /*
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(5, 6, 28, 16, 10, 4));
        Set<Short> set = new HashSet<Short>(nums.stream().map(x -> x.shortValue()).toList());
        for (Integer i : map(set)) {
            System.out.println(i);
        }
        */
        Extractor[] extractors = new Extractor[4];

        for (int i = 0; i < extractors.length; i++) {
            Extractor extractor = new Extractor();
            extractor.setAmount((i + 1) * 5);
        }
    }

    public static HashMap<Integer, List<String>> convert(String[] array) {
        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        int len;
        for (String word : array) {
            len = word.length();
            if (map.containsKey(len)) {
                map.get(len).add(word);
            } else {
                map.put(len, new LinkedList<String>());
                map.get(len).add(word);
            }
        }

        return map;
    }

    public static Set<Integer> map(Set<Short> set) {
        Set<Short> filtered = new HashSet<Short>(set.stream().filter(x -> x > 10).toList());
        filtered.add((short) 15);
        return new HashSet<Integer>(filtered.stream().map(x -> Integer.valueOf(x)).toList());
    }

    public static void stopOperations() {

    }
}