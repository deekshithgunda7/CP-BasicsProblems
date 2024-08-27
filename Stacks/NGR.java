class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ngr=nextGreater(nums2);
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            mpp.put(nums2[i],ngr[i]);
        }
        int ans[] =new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=mpp.get(nums1[i]);
        }
        return ans;
        
    }
    public static int[] nextGreater(int[] nums2){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(nums2[i]);

        }
        return ans;
    }
}