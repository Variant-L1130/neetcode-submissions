class Solution {
    public int[] sortArray(int[] nums) {
        ms(nums,0,nums.length-1);
        return nums;    
    }
    private void ms(int []a,int l,int r){
        if(l>=r){
            return;
        }
        int m = (l+r)/2;     
        ms(a,l,m);
        ms(a,m+1,r);
        m1(a,l,m,r);
    }
    private void m1(int[]a,int l,int m , int r){
        int[] t = new int[r-l+1];
        int v = l;
        int b = m+1;
        int c = 0;

        while(v<=m && b<=r){
            if(a[v] <= a[b]){
                t[c] = a[v];
                v ++;
                c++;  
            }
            else{
                t[c]= a[b];
                b++;
                c++;
            }
        }
        while (v<=m){
            
                t[c] = a[v];
                v ++;
                c++;  
        
    }
    while (b<=r){
        t[c]= a[b];
                b++;
                c++;
    }
    for(int z = 0;z<t.length;z++){
        a[l+z] = t[z];
    }
}
}