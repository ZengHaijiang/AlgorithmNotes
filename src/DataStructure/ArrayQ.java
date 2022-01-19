package DataStructure;

public class ArrayQ {
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


    /* 2.回文数*/
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0&&x!=0){
            return false;
        }else{
            int re=0;
            while(x>re){
                re=re*10+x%10;
                x/=10;
            }
            return x==re||x==re/10;
        }
    }
    /*（1）转换为字符串，节约时间的话可以只比较一半
      （2）难点有二，一是除10和余10操作得到个位，十位，再把他们翻转乘起来，
          所以要用前一个的余数乘10再加上现在的余数；其二就是要注意特殊case，比如负数
          尤其是末尾带0的这种违背我们逻辑的
     */
}
