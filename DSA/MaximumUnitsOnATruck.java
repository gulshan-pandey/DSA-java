package DSA;

public class MaximumUnitsOnATruck {
    /**
     * problem link    --> https://leetcode.com/problems/maximum-units-on-a-truck/description/
     * 
     * You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

    numberOfBoxes is the number of boxes of type i.
    numberOfUnitsPerBox is the number of units in each box of the type i.
    You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

    Return the maximum total number of units that can be put on the truck.

    

    Example 1:

    Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
    Output: 8
    Explanation: There are:
    - 1 box of the first type that contains 3 units.
    - 2 boxes of the second type that contain 2 units each.
    - 3 boxes of the third type that contain 1 unit each.
    You can take all the boxes of the first and second types, and one box of the third type.
    The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
    Example 2:

    Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
    Output: 91
     * 
     */
}


// O(log(n))


// class Solution {
//     public int maximumUnits(int[][] boxTypes, int truckSize) {
//          Arrays.sort(boxTypes, new Comparator<int[]>() {
//             @Override
//             public int compare(int[] a, int[] b) {
//                 return Integer.compare(b[1], a[1]); // Descending order
//             }
//         });

//         //  Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

//         int total =0;
        
//         for(int i=0; i<boxTypes.length; i++){
//             for(int j=0; j< boxTypes[i][0]; j++){
//                     total+=boxTypes[i][1];
//                     truckSize--;
//                     if(truckSize==0) break;
                    
//                 }
//                     if(truckSize==0) break;
//             }
        
//         return total;
//     }
// }



// O(log(n))


// class Solution {
//     public int maximumUnits(int[][] boxTypes, int truckSize) {

//         // Sort box types by units per box in descending order
//         Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

//         int total = 0;
        
//         // Iterate through the sorted box types
//         for (int i = 0; i < boxTypes.length; i++) {
//             // Determine how many boxes can be taken
//             int boxesToTake = Math.min(boxTypes[i][0], truckSize);
//             // Add units for the boxes taken
//             total += boxesToTake * boxTypes[i][1];
//             // Decrease the truck size by the number of boxes taken
//             truckSize -= boxesToTake;
//             // If truck is full, break the loop
//             if (truckSize == 0) break;
//         }
        
//         return total;
//     }
// }




// Counting sort(O(n)) approach   most optimized


class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] unitCount = new int[1001];

        for(int boxType[] : boxTypes) {
            unitCount[boxType[1]] += boxType[0];
        }

        int count = 0;

        for(int i = unitCount.length - 1;i>=0;i--) {
            if(unitCount[i] == 0)
                continue;

            int num = Math.min(truckSize, unitCount[i]);
            count += num * i;
            truckSize -= num;
            if(truckSize <= 0)
                break;
        }

        return count;
    }
}