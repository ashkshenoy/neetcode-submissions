class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
       
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        int pivot = l;
        int result = binarySearch(nums, target, 0, pivot - 1);
        if(result != -1){
            return result;
        }
        return  binarySearch(nums, target, pivot, nums.length-1);

    }
    public int binarySearch(int nums[], int target, int low, int high){
        while(low <= high){
            int mid = (low + high)/2;
            if(target == nums[mid])
                return mid;
            else if(nums[mid]< target){
               low = mid + 1;
            }
            else{
                high = mid - 1; 
            }
        }
        return -1;
    }
}
