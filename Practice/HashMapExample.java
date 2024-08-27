// Given an integer array nums and an integer k, return the k most frequent elements. 
// You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]


class Solution{
    public int[] mostFrequentlyUsed(int[] nums,int k){
        int[] res = new int[k];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList=new ArrayList<>(Map.entrySet());
        Collections.sort(entryLisy,(b,a)->b.getValue()-a.getValue()); //comparator to perform desc order
        for(int i=0;i<k;i++){
            res[i]=entryList.get(i).getKey();
        }
        return res;
    }
}

// HashMap has in built method called entry set which stores the entries 
//i,e key and value pairs using mpp.getKey() and mpp.getValue() we can access it

// for(Map.Entry<Integer,Integer> entry : mpp.EntrySet()){
//     key=entry.getKey();
//     freq=entry.getValue();
// }