package DSA;

import java.util.ArrayList;

public class FirstNegativeInEveryWindowOfSizeK {
    
    /*
     * Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

 
        Example 1:

        Input : 
        N = 5
        A[] = {-8, 2, 3, -6, 10}
        K = 2
        Output : 
        -8 0 -6 -6
        Explanation :
        First negative integer for each window of size k
        {-8, 2} = -8
        {2, 3} = 0 (does not contain a negative integer)
        {3, -6} = -6
        {-6, 10} = -6
        

        Example 2:
        Input : 
        N = 8
        A[] = {12, -1, -7, 8, -15, 30, 16, 28}
        K = 3
        Output :
        -1 -1 -7 -15 -15 0 

     */
    
}





class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        
        ArrayList<Long> list = new ArrayList<>();
        long[] ans = new long[N-K+1];
        int i =0;
        int j=0;
        int index=0;
        
        while(j<N){
            if(A[j]<0){
                list.add(A[j]);
            }
            
            if(j-i+1 > K){
                if(A[i]<0){
                    list.remove(0);
                }
                i++;
            }
            if(j-i+1==K){
                if(!list.isEmpty()) {
                    ans[index++]=list.get(0);
                }else ans[index++]=0;
                
            }
                j++;
        }
        return ans;
        
    }
}