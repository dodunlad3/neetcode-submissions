class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            if(!freq.containsKey(num)){
                freq.put(num, 1);
            } else{
                freq.put(num, freq.get(num) + 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> sortedFreq = new ArrayList<>(freq.entrySet());

        sortedFreq.sort((a, b) -> b.getValue() - a.getValue()); 

        int[] topFreq = new int[k];

        for(int i = 0; i < k; i++){
            topFreq[i] = sortedFreq.get(i).getKey();
        }

        return topFreq;


    }
}
