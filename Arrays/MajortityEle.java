

//Moore’s Voting Algorithm:
import java.util.*;

public class Solution{
    public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

}








class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int mini=(int)(n/3) + 1;
        for(int i=0;i<n;i++){
               mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
               if(mpp.get(nums[i]) == mini){
                    lst.add(nums[i]);
               }
            //    if(lst.size() == 2){
            //     break;
            //    }

        }
        return lst;
    }
}