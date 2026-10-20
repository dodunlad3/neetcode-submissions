class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> grams = new HashMap<>();

        for(String str : strs){
            // Initialize String and Array
            char[] stringArray = str.toCharArray();
            Arrays.sort(stringArray);
            String sortedString = new String(stringArray);

            if(grams.containsKey(sortedString)){
                grams.get(sortedString).add(str);
            
            } else { 
                grams.put(sortedString, new ArrayList<>());
                grams.get(sortedString).add(str);
            }

        }

        return new ArrayList<>(grams.values());

    }
}
