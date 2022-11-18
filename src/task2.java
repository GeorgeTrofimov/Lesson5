public class task2 {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        for (String s : words1) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for (String s : words2) {
            if (!map1.containsKey(s)) {
                map1.put(s, 1);
            } else {
                map1.put(s, map1.get(s) + 1);
            }
        }
        for (String s : words1) {
            if (Objects.equals(map.get(s), map1.get(s)) && map1.get(s) == 1) {
                count++;
            }
        }
        return count;
    }
}