public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int asum = 0;
        for (int i = 0; i < n; i++) {
            asum += nums[i];
        }
        int missnum = sum - asum;
        return missnum;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.err.println(missingNumber(nums));
    }
}
