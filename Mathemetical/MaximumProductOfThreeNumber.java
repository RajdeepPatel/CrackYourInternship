import java.util.Arrays;

class MaximumProductOfThreeNumber{
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        return Math.max(nums[n] * nums[n - 1] * nums[n - 2], nums[0] * nums[1] * nums[n]);
    }

    public static void main(String...arg){
    int[] arr={-100,-98,-1,2,3,4};
    System.out.println(maximumProduct(arr));
    }
}