public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 1) + 1); // Error 1
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getKey(), entry.getValue()}); // Error 2
        }
        arr.sort((a, b) -> a[0] - b[0]); // Error 3

        int[] res = new int[k];
        for (int i = 0; i <= k; i++) { // Error 4
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}