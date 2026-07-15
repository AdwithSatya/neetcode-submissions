class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null|| nums.length==0) return 0;
        int length=1;
        int maxlength=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
        if(nums[i]+1==nums[i+1]){length++;
        maxlength=Math.max(length,maxlength);
        }
        else if(nums[i]==nums[i+1]) continue;
        else{
            length=1;
        }
        }  
        
        
   return maxlength; }
}
