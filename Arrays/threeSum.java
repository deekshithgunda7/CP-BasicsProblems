class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && (nums[i] == nums[i-1])) continue; 
            int k=nums.length-1;
            int j=i+1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum <0){
                    j++;
                }
                else{
                 List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
                 ans.add(temp);
                 j++;
                 k--;

                 while(j<k && nums[j] == nums[j-1]) j++;
                 while(j<k && nums[k] == nums[k+1]) k--;

                }
            }
        }
        return ans;
        
    }
}



// Better Solution
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> st=new HashSet<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             Set<Integer> hash=new HashSet<>();
//             for(int j=i+1;j<n;j++){
//                     int sum=-(nums[i]+nums[j]);
//                     if(hash.contains(sum)){
//                         List<Integer> lst=Arrays.asList(nums[i],nums[j],sum);
//                         lst.sort(null);
//                         st.add(lst);
//                     }
//                     hash.add(nums[j]);
                
//             }
//         }
//         List<List<Integer>> ans=new ArrayList<>(st);
       
//         return ans;
//     } 
// }