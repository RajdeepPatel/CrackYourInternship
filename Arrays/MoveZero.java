//https://leetcode.com/problems/move-zeroes/description/
public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i =0; i<nums.length; i++){
             if(nums[i]!=0){
                 int temp = nums[k];
                 nums[k]=nums[i];
                 nums[i]=temp;
                 k++;
             }
         }
     }

     public static void main(String[] args) {
         int[] nums={0,1,0,3,12};
        moveZeroes(nums);
     }
}
