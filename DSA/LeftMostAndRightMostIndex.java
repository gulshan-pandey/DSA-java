package DSA;
public class LeftMostAndRightMostIndex {
    
    /**
     * Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

        Note: If the element is not present in the array return {-1,-1} as pair.

        

        Example 1:

        Input:
        N = 9
        v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
        X = 5
        Output:
        2 5
        Explanation:
        Index of first occurrence of 5 is 2
        and index of last occurrence of 5 is 5.
        Example 2:

        Input:
        N = 9
        v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
        X = 7
        Output:
        6 6
        

        Your Task:  
        You don't need to read input or print anything. Your task is to complete the function indexes() which takes the array v[] and an integer X as inputs and returns  the first and last occurrence of the element X. If the element is not present in the array return {-1,-1} as pair.

        Can you solve the problem in expected time complexity?


        Expected Time Complexity: O(Log(N))
        Expected Auxiliary Space: O(1)
     */
}




    /*
    class pair  {  
        long first, second;  
        public pair(long first, long second)  
        {  
            this.first = first;  
            this.second = second;  
        }  
    }
    */
    

    class Solution {
        
        public pair indexes(long v[], long x)
        {
            // Your code goes here
            long first=-1;
            long second=-1 ;
            int n=v.length;
            int l=0;
           int r=n-1;
            
            while(l<=r){
                int mid =l+(r-l)/2;
                if(v[mid]==x){
                    first =mid;
                    r=mid-1;
                    continue;
                }
                if(v[mid]<x){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
            
            
            l=0;
            r=n-1;
            while(l<=r){
                int mid =l+(r-l)/2;
                if(v[mid]==x){
                    second =mid;
                    l=mid+1;
                    continue;
                }
                if(v[mid]<x){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
            
            
            return new pair(first,second);
            
        }
        
            
        
    }