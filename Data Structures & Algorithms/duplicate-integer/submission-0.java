class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if (map.getOrDefault(nums[i], 0) == 0) {
                map.put(nums[i], 1);
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}