package DSA;
public class GasStation {
    
    /**
     * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

        You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

        Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.

        

        Example 1:

        Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        Output: 3
        Explanation:
        Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
        Travel to station 4. Your tank = 4 - 1 + 5 = 8
        Travel to station 0. Your tank = 8 - 2 + 1 = 7
        Travel to station 1. Your tank = 7 - 3 + 2 = 6
        Travel to station 2. Your tank = 6 - 4 + 3 = 5
        Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
        Therefore, return 3 as the starting index.
        Example 2:

        Input: gas = [2,3,4], cost = [3,4,3]
        Output: -1
        Explanation:
        You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
        Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
        Travel to station 0. Your tank = 4 - 3 + 2 = 3
        Travel to station 1. Your tank = 3 - 3 + 3 = 3
        You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
        Therefore, you can't travel around the circuit once no matter where you start.
 
     * 
     */
}





// Brute force


// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int n =gas.length;
//         int j=0;
//         for( ; j<gas.length; j++){
//              int ggas=0;
//              boolean can=true;
//             for(int i =0; i<n; i++){
//                int temp = (i+j)%n;      // Circular traversal
//                 ggas+=gas[temp];
//                 if(ggas>=cost[temp]){
//                     ggas-=cost[temp];    // Subtract the cost of moving to the next station
//                     continue;
//                 }else{
//                     can=false;
//                     break;
//                 } 
//             }
//                 if(can) return j;
//         }
//         return -1;
//     }
// }













class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0; // Total gas available
        int totalCost = 0; // Total cost required
        int currentGas = 0; // Current gas balance
        int startIndex = 0; // Starting index of the valid circuit
        
        // Iterate through each gas station
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];
            
            // If currentGas becomes negative, the current start index won't work
            if (currentGas < 0) {
                // Reset currentGas and set startIndex to the next station
                startIndex = i + 1;
                currentGas = 0;
            }
        }
        
        // Check if the total gas is sufficient to complete the circuit
        return totalGas >= totalCost ? startIndex : -1;
    }
}