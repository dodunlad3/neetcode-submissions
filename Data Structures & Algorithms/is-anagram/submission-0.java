class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char ch : sArray){
            if(!sMap.containsKey(ch)){
                sMap.put(ch, 1);
            } else {
                sMap.put(ch, sMap.get(ch) + 1);
            }
            
        }

        for(char ch : tArray){
            if(!sMap.containsKey(ch)){
                return false;
                
            } else {
                sMap.put(ch, sMap.get(ch) - 1);
            }

            
        }

        for(Map.Entry<Character, Integer> entry : sMap.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}
