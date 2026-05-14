class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        map.forEach((num, freq) -> {
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });

        List<Integer> res = new ArrayList<>();

        for(int i = buckets.length - 1; i > 0 && res.size() < k; i--){
            if(buckets[i] != null) res.addAll(buckets[i]);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
