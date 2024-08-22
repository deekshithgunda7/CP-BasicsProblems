// Optional Prifix
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int cnt=0;
        int xr=0;
        HashMap<Integer,Integer> mpp=new J=HashMap<>();
        mpp.put(xr,1);
        for(int i=0;i<A.size();i++){
           xr=xr^A.get(i);
           int x =xr ^ B;
           
           if(mpp.containsKey(x)){
               cnt  += mpp.get(x);
           }
           
           if(mpp.containsKey(xr)){
               mpp.put(xr,mpp.get(xr)+1);
           }
           else{
               mpp.put(xr,1);
           }
        }
        return cnt;
    }
}

// better solution
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int cnt=0;
        for(int i=0;i<A.size();i++){
            int xor=0;
            for(int j=i;j<A.size();j++){
               
                xor=xor^A.get(k);
                if(xor == B) cnt++;
            }
        }
        return cnt;
    }
}