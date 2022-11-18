class Solution {

    public List<List<String>> findDuplicate(String[] paths) {

        Map<String, List<String>> m = new HashMap<>();

        for (String x : paths) {

            String[] arr = x.split(" ");

            String dir = arr[0];

            for (int i = 1; i < arr.length; i++) {

                String fileName = arr[i].substring(0, arr[i].indexOf('('));
                String text = arr[i].substring(arr[i].indexOf('(') + 1, arr[i].length() - 1);


                List<String> li = m.getOrDefault(text, new ArrayList<>());
                li.add(dir + "/" + fileName);
                m.put(text, li);
            }
        }

        ArrayList<String> non_duplicates = new ArrayList<>();

        for (String x : m.keySet()) {
            if (m.get(x).size() == 1) non_duplicates.add(x);
        }

        for (String x : non_duplicates) {
            m.remove(x);
        }

        return new ArrayList<>(m.values());
    }
}