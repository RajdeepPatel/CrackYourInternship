//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
              cnt++;
              if(max<cnt){
                max=cnt;
              }
            }
            else{
                cnt=0;
            }
        }
    return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
