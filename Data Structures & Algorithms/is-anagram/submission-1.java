class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> seenMap = new HashMap<>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char ch : sArray){
            if(!seenMap.containsKey(ch)){
                seenMap.put(ch, 1);
            } else {
                seenMap.put(ch, seenMap.get(ch) + 1);
            }
        }

        for(char ch : tArray){

            if(seenMap.containsKey(ch)){
                seenMap.put(ch, seenMap.get(ch) -1);
                if(seenMap.get(ch) < 0){
                    return false;

                }
            } else {
                return false;
            }

            
        }

        return true;


    }
}
