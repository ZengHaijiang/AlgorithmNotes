package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ {
    /*1.Two Sum
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)&&map.get(temp)!=i){
                return new int[]{i,map.get(temp)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
