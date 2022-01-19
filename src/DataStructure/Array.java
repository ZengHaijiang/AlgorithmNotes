package DataStructure;

public class Array {
    /*1.Two Sum
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i< nums.length-1; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    /* 直接用 int[]{i,j}创建数组方便很多*/
}
