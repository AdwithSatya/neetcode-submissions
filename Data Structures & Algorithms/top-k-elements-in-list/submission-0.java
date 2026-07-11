class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> [] list=new List[nums.length+1];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(list[freq]==null){
                list[freq]=new ArrayList<>();
            }
            list[freq].add(key);
        }
        int [] result=new int[k];
        int idx=0;
        for(int freq=list.length-1;freq>0 && idx<k;freq--){
            if(list[freq]!=null){
                for(int num:list[freq]){
                    if (idx < k) {
                        result[idx++]=num;
                    }
                }
            }
        }
        return result;
    }
}