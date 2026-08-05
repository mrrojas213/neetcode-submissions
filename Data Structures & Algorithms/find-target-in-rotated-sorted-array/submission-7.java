class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int m = (left + right) / 2;

            if(nums[m] == target) return m;

            if(nums[left] <= nums[m]){
                if(nums[left] > target || nums[m] < target){
                    left = m + 1;
                } else{
                    right = m - 1;
                }
            } else{
                if(nums[right] < target || nums[m] > target){
                    right= m - 1; 
                } else{
                    left = m + 1;
                }
            }
        }

        return -1;
    }
}
