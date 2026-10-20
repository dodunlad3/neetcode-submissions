class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            if(frequency.containsKey(num)){
                frequency.put(num, frequency.get(num) + 1);
            } else{
                frequency.put(num, 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> sortedNums = new ArrayList<>(frequency.entrySet());
        sortedNums.sort((a, b) -> b.getValue() - a.getValue());
        
        int[] topFreq = new int[k];

        for(int i = 0; i < k; i++){
            topFreq[i] = sortedNums.get(i).getKey();
        } 
        
        
        return topFreq;
    }
}
