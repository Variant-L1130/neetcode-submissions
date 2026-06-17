class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0,m=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                r++;
            }
            else if(nums[i] == 1){
                w++;
            }
            else{
                b++;
            } 
        }
        while (r>0){
            nums[m]=0;
            m++;
            r--;
        }
        while (w>0){
            nums[m]=1;
            m++;
            w--;
        }
        while (b>0){
            nums[m]=2;
            m++;
            b--;
        }
        
        
        
    }
}