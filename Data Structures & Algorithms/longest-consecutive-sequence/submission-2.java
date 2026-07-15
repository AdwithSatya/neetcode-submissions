class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxlength=0;
        if(nums.length==0) return 0;
        
        for(int num:nums){
            int current;
            if(!set.contains(num-1)){
                current=num;
                int length=1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                maxlength=Math.max(length,maxlength);


            }

        }
        
    return maxlength;}
}
