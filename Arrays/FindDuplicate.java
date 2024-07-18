// https://leetcode.com/problems/find-the-duplicate-number/description/
class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(true){
            if(nums[i]==0){
                return i;
            }
            int temp=nums[i];
            nums[i]=0;
            i=temp;
        }
    }
    public static void main(String...arg){
        int nums[]={1,3,4,2,2};
        int i=findDuplicate(nums);
        System.out.println(i);
    }
}