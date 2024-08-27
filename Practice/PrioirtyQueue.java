 // Kth Largest Element in an Array
//  Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Can you solve it without sorting?

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5

class Solution{
    public int Largest(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int f = k-1;
        while(f>0){
            pq.remove();
            f--;
        }
        return pq.peek();
    }
}