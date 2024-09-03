package DSA;
import java.util.Arrays;
import java.util.HashMap;

public class CarFleet {
    /*
     * 
     * There are n cars at given miles away from the starting mile 0, traveling to reach the mile target.

        You are given two integer array position and speed, both of length n, where position[i] is the starting mile of the ith car and speed[i] is the speed of the ith car in miles per hour.

        A car cannot pass another car, but it can catch up and then travel next to it at the speed of the slower car.

        A car fleet is a car or cars driving next to each other. The speed of the car fleet is the minimum speed of any car in the fleet.

        If a car catches up to a car fleet at the mile target, it will still be considered as part of the car fleet.

        Return the number of car fleets that will arrive at the destination.

        

        Example 1:

        Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]

        Output: 3

        Explanation:

            The cars starting at 10 (speed 2) and 8 (speed 4) become a fleet, meeting each other at 12. The fleet forms at target.
            The car starting at 0 (speed 1) does not catch up to any other car, so it is a fleet by itself.
            The cars starting at 5 (speed 1) and 3 (speed 3) become a fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.


        Example 2:

        Input: target = 10, position = [3], speed = [3]

        Output: 1

        Explanation:
        There is only one car, hence there is only one fleet.


        Example 3:

        Input: target = 100, position = [0,2,4], speed = [4,2,1]

        Output: 1

        Explanation:

            The cars starting at 0 (speed 4) and 2 (speed 2) become a fleet, meeting each other at 4. The car starting at 4 (speed 1) travels to 5.
            Then, the fleet at 4 (speed 2) and the car at position 5 (speed 1) become one fleet, meeting each other at 6. The fleet moves at speed 1 until it reaches target.


     */
}

/**Intuition is :
 * we will store the time of each vehicle to reach the target in assending order{we can sort the array or we can make the array and put the vehicles in such a way that they get sorted acc to reaching the target in assending order}
 * the time of each vehicle is : (target - position[i])/speed[i])
 * then we will traverse the time array form the end and notice that if the previous car takes less time then that previous will make fleet with current,
 * after while keep traversing the array if the car taking more time then it will be another fleet and hence keep increasing the count
 * 
 */

 
// class Solution {                     // O(nlogn)--- using map to store speed of vehicles
//     public int carFleet(int target, int[] position, int[] speed) {
//         var map = new HashMap<Integer,Integer>();
//         for(int i =0; i<position.length; i++){
//             map.put(position[i],speed[i]);
//         }
//         Arrays.sort(position);
//         double[] time = new double[speed.length];
//         for(int i=0; i<position.length; i++){
//             time[i]= (double)(target-position[i])/map.get(position[i]);
//         }
//         double temp = 0; 
//         int count=0;  
//         for(int i=position.length-1; i>=0; i--){ 
//             if(time[i]>temp){
//                 temp= time[i];
//                 count++;
//             }
            
//         }
//         return count;
//    }
// }




// in O(n) time and space  using aray to store time of vehicles

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] distance = new double[target+1];                   // actually it is storing time of each vehical in assending order with respect to there positions

        for(int i = 0; i < position.length; i++) {
            distance[position[i]] = (double)(target - position[i]) / speed[i];
        }

        int fleet = 0;
        double max = Double.MIN_VALUE;
        for(int i = distance.length - 1; i >= 0; i--) {
            if(distance[i] > max) {
                max = distance[i];
                fleet++;
            }
        }

        return fleet;
    }
}