class task1 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> count1 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (count1.containsKey(nums1[i])) {
                int num = count1.get(nums1[i]) + 1;
                count1.put(nums1[i], num);
            } else {
                count1.put(nums1[i], 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if (count1.containsKey(nums2[i])) {
                if (count1.get(nums2[i]) > 0) {
                    count1.put(nums2[i], count1.get(nums2[i]) - 1);
                    ans.add(nums2[i]);
                }
            }
        }

        int[] answ = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answ[i] = ans.get(i);
        }
        return answ;
    }
}