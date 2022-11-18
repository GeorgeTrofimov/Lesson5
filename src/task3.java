public class task3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1 || k == 0) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (map.containsKey(val)) {
                int prevIdx = map.get(val);
                if (i - prevIdx <= k) {
                    return true;
                }
            }
            map.put(val, i);
        }
        return false;
    }
}
}
