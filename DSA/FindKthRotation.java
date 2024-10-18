package DSA;

public class FindKthRotation {
    /**
     * 
     * Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
        Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
        After 1st Rotation : [9, 2, 4, 6]
        After 2nd Rotation : [6, 9, 2, 4]

        Examples:

        Input: arr = [5, 1, 2, 3, 4]
        Output: 1
        Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.
        
        
        Input: arr = [1, 2, 3, 4, 5]
        Output: 0
        Explanation: The given array is not rotated.
        Expected Time Complexity: O(log(n))
        Expected Auxiliary Space: O(1)
     */
}



class Solution {
    public int findKRotation(List<Integer> arr) {
        int n = arr.size();
        int l=0,h=n-1;
        if (arr.get(l) <= arr.get(h)) return 0;
         
        while(l<=h){
            if (arr.get(l) <= arr.get(h)) return l;
            int m = l +(h-l)/2;
            int next = (m + 1) % n;
            int prev = (m - 1 + n) % n;
            if(arr.get(m)<=arr.get(prev) && arr.get(m)<=arr.get(next)){
                    return m;
                }
            else if(arr.get(m)>=arr.get(l)){
                l=m+1;
            }else {
                h=m-1;
            
            }
        }
        return 0;
    
    }
}




// another approach    --->  https://youtu.be/W9QJ8HaRvJQ?si=Mz-WnF7_41MMu6YB&t=12460

class Solution {
    public int findKRotation(List<Integer> arr) {
        int n = arr.size();
        int l=0,h=n-1;
         if (arr.get(0) <= arr.get(h)) {
            return 0;
        }
        while(l<=h){
            int mid = l +(h-l)/2;
            
            if(mid<h && arr.get(mid) > arr.get(mid+1)){
                return mid+1;
            }
            if(mid>l && arr.get(mid)< arr.get(mid-1)){
                return mid;
            }
            if(arr.get(mid) <=arr.get(l)){
                h= mid-1;
            }else{
                l = mid+1;
            }
        }
        return 0;
    }
}
























