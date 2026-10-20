class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> seen = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char ch : sArray){
            if(seen.containsKey(ch)){
                seen.put(ch, seen.get(ch) + 1);
            } else{
                seen.put(ch, 1);
            }
        }

        for(char ch : tArray){
            if(!seen.containsKey(ch)){
                return false;
            } else{
                seen.put(ch, seen.get(ch) - 1);
            }

            if(seen.get(ch) < 0){
                return false;
            }
        }

        return true;
    }
}
