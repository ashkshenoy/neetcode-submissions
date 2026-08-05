class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
       
        int size = map.size();
        for(int i = 0; i < s2.length(); i++){
            HashMap<Character, Integer> map1 = new HashMap<>();
            int currentSize = 0;
            for(int j = i; j < s2.length(); j++){
                Character ch = s2.charAt(j);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                if(map.getOrDefault(ch, 0) < map1.get(ch))
                    break;
                if(map.getOrDefault(ch, 0) == map1.get(ch))
                    currentSize++;
                if(currentSize == size)
                    return true;
            }
        }
        return false;
    }
}
