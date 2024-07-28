//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            arr[0]=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=7;
        twoSum(arr,target);
    }
}
