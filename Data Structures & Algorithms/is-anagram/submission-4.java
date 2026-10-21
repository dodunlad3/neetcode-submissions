class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char ch : sArray){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) + 1);
            } else{
                freq.put(ch, 1);
            }
        }

        for(char ch : tArray){
            if(!freq.containsKey(ch)){
                return false;
            } else{
                freq.put(ch, freq.get(ch) - 1);
                if (freq.get(ch) < 0){
                    return false;
                }
            }
        }

        return true;

    }
}
