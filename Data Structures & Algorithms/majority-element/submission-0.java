class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            int n = m.getOrDefault(nums[i],0);
            n++;
            m.put(nums[i],n);
            if(n>nums.length/2){
                return nums[i];
            }
        }
        return -1;
        
    }
}