//Optimal Solution
//Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
       
       long maxi=Integer.MIN_VALUE;
       long sum=0;
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        if(sum>maxi){
            maxi=sum;     
        }
        if(sum<0){
            sum=0;
        }
      
       
       }
       return (int)maxi;

        
    }
}

//Better Solution
class Solution {
    public int maxSubArray(int[] nums) {
       
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
        
    }
}