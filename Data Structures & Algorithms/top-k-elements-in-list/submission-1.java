class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myHashMap = new HashMap<>();
        for (int i=0 ;i<nums.length;i++){
         myHashMap.put(nums[i], myHashMap.getOrDefault(nums[i], 0) + 1);
        }
     PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> value : myHashMap.entrySet()) {
            pq.add(value);
            if (pq.size() > k) {
                pq.poll();
            }
            
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    

    }
}
