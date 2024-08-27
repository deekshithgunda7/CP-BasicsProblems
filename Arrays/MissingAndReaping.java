class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        long s=((n)*(n+1))/2;
        long sn=((n)*(n+1)*(2*n+1))/6;
        
        long s1=0;
        long s2=0;
        for(int i=0;i<n;i++){
            s1=s1+arr[i];
            s2 += (long)arr[i]*(long)arr[i];
        }
        
        long val1=s1-s;
        long val2=s2-sn;
        val2=val2/val1;
        long x = (val1+val2)/2;
        long y= x-val1;
        
        int[] ans ={(int)x,(int)y};
        return ans;
    }
}