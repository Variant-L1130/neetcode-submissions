class Solution {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                int n = nums[m];
                nums[m] = nums[i];
                //nums[i] = n;

                m++;

            }
        }
        return m;
        
        
    }
}